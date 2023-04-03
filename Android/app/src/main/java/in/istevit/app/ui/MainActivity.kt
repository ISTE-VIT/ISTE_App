package `in`.istevit.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.R
import `in`.istevit.app.databinding.ActivityMainBinding

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
                when (it) {
                    R.id.nav_home -> {
                        navController.apply {
                            if (itemSelected != it) {
                                popBackStack()
                                navigate(R.id.announcementsFragment)
                                itemSelected = it
                            }
                        }
                    }
                    R.id.nav_blog -> {
                        navController.apply {
                            if (itemSelected != it) {
                                popBackStack()
                                navigate(R.id.blogFragment)
                                itemSelected = it
                            }
                        }
                    }
                    R.id.nav_more -> {
                        val bottomSheetDialogFragment = OptionsFragment()
                        bottomSheetDialogFragment.show(
                            supportFragmentManager,
                            bottomSheetDialogFragment.tag
                        )
                        chipNav.setItemSelected(itemSelected, true)
                    }
                    R.id.nav_event -> {
                        navController.apply {
                            if (itemSelected != it) {
                                popBackStack()
                                navigate(R.id.eventFragment)
                                itemSelected = it
                            }
                        }
                    }
                    R.id.nav_gallery -> {
                        navController.apply {
                            if (itemSelected != it) {
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