package `in`.istevit.app.ui

import `in`.istevit.app.R
import `in`.istevit.app.databinding.ActivityMainBinding
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetDialog

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
                        val view = layoutInflater.inflate(R.layout.bottom_sheet_webview, null)
                        view.findViewById<WebView>(R.id.webView_bottom_sheet).loadUrl("https://guides.codepath.com/android/fragment-navigation-drawer")
                        bottomSheetDialog.setContentView(view)
                        bottomSheetDialog.show()
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

//            floatingNavigationView.setOnClickListener {
//                floatingNavigationView.open()
//            }
        }
    }
}