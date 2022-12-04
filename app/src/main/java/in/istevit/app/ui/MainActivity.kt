package `in`.istevit.app.ui

import `in`.istevit.app.R
import `in`.istevit.app.databinding.ActivityMainBinding
import `in`.istevit.app.ui.flagship.FlagshipActivity
import `in`.istevit.app.ui.projects.ProjectsActivity
import `in`.istevit.app.ui.resources.ResourcesActivity
import `in`.istevit.app.util.Constants
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController
    private var itemSelected: Int = R.id.nav_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        binding.apply {
            chipNav.setItemSelected(R.id.nav_home, true)
            chipNav.setOnItemSelectedListener {
                when(it){
                    R.id.nav_home -> {
                        navController.apply {
                            if(itemSelected != it){
                                popBackStack()
                                navigate(R.id.announcementsFragment)
                                itemSelected = it
                            }
                        }
                    }
                    R.id.nav_blog -> {
                        navController.apply {
                            if(itemSelected != it){
                                popBackStack()
                                navigate(R.id.blogFragment)
                                itemSelected = it
                            }
                        }
                    }
                    R.id.nav_more -> {
                        val bottomSheetDialog = BottomSheetDialog(this@MainActivity)
                        val view = layoutInflater.inflate(R.layout.bottom_sheet_options, null)
                        bottomSheetDialog.setContentView(view)
                        bottomSheetDialog.show()

                        bottomSheetDialog.findViewById<ImageView>(R.id.resourcesBTN)?.setOnClickListener {
                            startActivity(Intent(this@MainActivity, ResourcesActivity::class.java))
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.flagshipBTN)?.setOnClickListener{
                            val intent = Intent(this@MainActivity, FlagshipActivity::class.java)
                            startActivity(intent)
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.projectsBTN)?.setOnClickListener {
                            startActivity(Intent(this@MainActivity, ProjectsActivity::class.java))
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.aboutBTN)?.setOnClickListener{
                            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(Constants.ISTE_WEBSITE)))
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.instagramBTN)?.setOnClickListener {
                            val uri = Uri.parse(Constants.INSTAGRAM_URL)
                            val instaIntent = Intent(Intent.ACTION_VIEW, uri)
                            instaIntent.setPackage("com.instagram.android")
                            try {
                                startActivity(instaIntent)
                            } catch (e: ActivityNotFoundException) {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(Constants.INSTAGRAM_URL)
                                    )
                                )
                            }
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.facebookBTN)?.setOnClickListener {
                            try {
                                packageManager.getPackageInfo("com.facebook.katana", 0)
                                val facebookIntent = Intent(Intent.ACTION_VIEW, Uri.parse(Constants.FACEBOOK_APP_URL))
                                startActivity(facebookIntent)
                            } catch (e: Exception) {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(Constants.FACEBOOK_URL)
                                    )
                                )
                            }
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.linkedinBTN)?.setOnClickListener {
                            try {
                                packageManager.getPackageInfo("com.linkedin.android", 0)
                                val linkedinIntent = Intent(Intent.ACTION_VIEW, Uri.parse(Constants.LINKEDIN_URL))
                                startActivity(linkedinIntent)
                            } catch (e: Exception) {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(Constants.LINKEDIN_URL)
                                    )
                                )
                            }
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.githubBTN)?.setOnClickListener {
                            try {
                                packageManager.getPackageInfo("com.github.android", 0)
                                val githubIntent = Intent(Intent.ACTION_VIEW, Uri.parse(Constants.GITHUB_URL))
                                startActivity(githubIntent)
                            } catch (e: Exception) {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(Constants.GITHUB_URL)
                                    )
                                )
                            }
                            bottomSheetDialog.dismiss()
                        }

                        bottomSheetDialog.findViewById<ImageView>(R.id.youtubeBTN)?.setOnClickListener {
                            try {
                                val youtubeIntent = Intent(Intent.ACTION_VIEW)
                                youtubeIntent.data = Uri.parse(Constants.YOUTUBE_URL)
                                youtubeIntent.setPackage("com.google.android.youtube")
                                startActivity(youtubeIntent)
                            } catch (e: Exception) {
                                startActivity(
                                    Intent(
                                        Intent.ACTION_VIEW,
                                        Uri.parse(Constants.FACEBOOK_URL)
                                    )
                                )
                            }
                            bottomSheetDialog.dismiss()
                        }

                        chipNav.setItemSelected(itemSelected, true)
                    }
                    R.id.nav_event -> {
                        navController.apply {
                            if(itemSelected != it){
                                popBackStack()
                                navigate(R.id.eventFragment)
                                itemSelected = it
                            }
                        }
                    }
                    R.id.nav_gallery -> {
                        navController.apply {
                            if(itemSelected != it){
                                popBackStack()
                                navigate(R.id.galleryFragment)
                                itemSelected = it
                            }
                        }
                    }
                }
            }
        }
    }
}