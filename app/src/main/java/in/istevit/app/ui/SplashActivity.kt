package `in`.istevit.app.ui

import `in`.istevit.app.databinding.ActivitySplashBinding
import `in`.istevit.app.ui.onBoarding.OnBoardingActivity
import `in`.istevit.app.util.Constants.Companion.ISTE_SHARED_PREFERENCES
import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        lifecycleScope.launch {
            delay(500)

            val sharedPreferences: SharedPreferences = getSharedPreferences(ISTE_SHARED_PREFERENCES, MODE_PRIVATE)
            startActivity(Intent(this@SplashActivity, when{
                sharedPreferences.getBoolean(
                    "isFirstLaunch",
                    true
                ) -> OnBoardingActivity::class.java
                else -> MainActivity::class.java
            }))
            finish()
        }
    }
}