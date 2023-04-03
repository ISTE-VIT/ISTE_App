package `in`.istevit.app.ui

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import `in`.istevit.app.databinding.FragmentOptionsBinding
import `in`.istevit.app.ui.flagship.FlagshipActivity
import `in`.istevit.app.ui.resources.ResourcesActivity
import `in`.istevit.app.util.*

class OptionsFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentOptionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOptionsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            resourcesBTN.setOnClickListener {
                startActivity(Intent(activity, ResourcesActivity::class.java))
                dismiss()
            }

            flagshipBTN.setOnClickListener {
                startActivity(Intent(activity, FlagshipActivity::class.java))
                dismiss()
            }

            projectsBTN.setOnClickListener {
                startActivity(Intent(activity, FlagshipActivity::class.java))
                dismiss()
            }

            aboutBTN.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(ISTE_WEBSITE)))
                dismiss()
            }

            instagramBTN.setOnClickListener {
                val uri = Uri.parse(INSTAGRAM_URL)
                val instaIntent = Intent(Intent.ACTION_VIEW, uri)
                instaIntent.setPackage("com.instagram.android")
                try {
                    startActivity(instaIntent)
                } catch (e: ActivityNotFoundException) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(INSTAGRAM_URL)
                        )
                    )
                }
                dismiss()
            }

            facebookBTN.setOnClickListener {
                try {
                    activity?.packageManager?.getPackageInfo("com.facebook.katana", 0)
                    val facebookIntent =
                        Intent(Intent.ACTION_VIEW, Uri.parse(FACEBOOK_APP_URL))
                    startActivity(facebookIntent)
                } catch (e: Exception) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(FACEBOOK_URL)
                        )
                    )
                }
                dismiss()
            }

            linkedinBTN.setOnClickListener {
                try {
                    activity?.packageManager?.getPackageInfo("com.linkedin.android", 0)
                    val linkedinIntent =
                        Intent(Intent.ACTION_VIEW, Uri.parse(LINKEDIN_URL))
                    startActivity(linkedinIntent)
                } catch (e: Exception) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(LINKEDIN_URL)
                        )
                    )
                }
                dismiss()
            }

            githubBTN.setOnClickListener {
                try {
                    activity?.packageManager?.getPackageInfo("com.github.android", 0)
                    val githubIntent = Intent(Intent.ACTION_VIEW, Uri.parse(GITHUB_URL))
                    startActivity(githubIntent)
                } catch (e: Exception) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(GITHUB_URL)
                        )
                    )
                }
                dismiss()
            }

            youtubeBTN.setOnClickListener {
                try {
                    val youtubeIntent = Intent(Intent.ACTION_VIEW)
                    youtubeIntent.data = Uri.parse(YOUTUBE_URL)
                    youtubeIntent.setPackage("com.google.android.youtube")
                    startActivity(youtubeIntent)
                } catch (e: Exception) {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(FACEBOOK_URL)
                        )
                    )
                }
                dismiss()
            }
        }
    }
}