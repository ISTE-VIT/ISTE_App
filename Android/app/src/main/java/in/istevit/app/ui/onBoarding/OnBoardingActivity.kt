package `in`.istevit.app.ui.onBoarding

import `in`.istevit.app.R
import `in`.istevit.app.databinding.ActivityOnBoardingBinding
import `in`.istevit.app.ui.MainActivity
import `in`.istevit.app.util.Constants.Companion.ISTE_SHARED_PREFERENCES
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.firebase.messaging.FirebaseMessaging

class OnBoardingActivity : AppCompatActivity() {
    private val context: Context = this
    private lateinit var pagerAdapter: OnboardingPagerAdapter
    lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPreferences = context.getSharedPreferences(ISTE_SHARED_PREFERENCES, MODE_PRIVATE)
        pagerAdapter = OnboardingPagerAdapter(supportFragmentManager)

        FirebaseMessaging.getInstance().subscribeToTopic("events")
            .addOnCompleteListener { task ->
                if (!task.isSuccessful) {
                    Toast.makeText(this@OnBoardingActivity, "Subscription failed", Toast.LENGTH_SHORT).show()
                }
            }

        binding.apply {
            viewPager.adapter = pagerAdapter
            next.setOnClickListener {
                if (viewPager.currentItem == pagerAdapter.count - 1) {
                    sharedPreferences.edit().putBoolean("isFirstLaunch", false).apply()
                    startActivity(Intent(this@OnBoardingActivity, MainActivity::class.java))
                    finish()
                } else
                    ++viewPager.currentItem
            }
            viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int,
                ) {
                }

                override fun onPageSelected(position: Int) {
                    next.text = getString(
                        when (position) {
                            pagerAdapter.count - 1 -> R.string.continue_btn
                            else -> R.string.next_btn
                        }
                    )
                }

                override fun onPageScrollStateChanged(state: Int) {}
            })
        }
    }

    override fun onBackPressed() {
        if (binding.viewPager.currentItem > 0)
            --binding.viewPager.currentItem
        else
            super.onBackPressed()
    }

    private inner class OnboardingPagerAdapter(fragmentManager: FragmentManager) :
        FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

        override fun getCount(): Int = 3

        override fun getItem(position: Int): Fragment = OnboardingFragment(position)

    }
}