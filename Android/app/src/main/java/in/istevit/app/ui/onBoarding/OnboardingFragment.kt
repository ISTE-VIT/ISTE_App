package `in`.istevit.app.ui.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import `in`.istevit.app.R
import `in`.istevit.app.databinding.FragmentOnboardingBinding
import android.util.Log
import androidx.core.content.ContextCompat

class OnboardingFragment(private val position: Int) : Fragment() {
    lateinit var binding: FragmentOnboardingBinding

    private val images = intArrayOf(
        R.drawable.onboarding_1,
        R.drawable.onboarding_2,
        R.drawable.onboarding_1
    )

    private val texts = intArrayOf(
        R.string.on_boarding_1,
        R.string.on_boarding_2,
        R.string.on_boarding_3
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            textView.text = getString(texts[position])
            imageView.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    images[position]
                )
            )
        }
    }
}