package `in`.istevit.app.ui

import `in`.istevit.app.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.bottomNavigation.setOnItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.item1 -> {
//                    // Respond to navigation item 1 reselection
//                }
//                R.id.item2 -> {
//                    // Respond to navigation item 2 reselection
//                }
//                else -> {}
//            }
//        }
    }
}