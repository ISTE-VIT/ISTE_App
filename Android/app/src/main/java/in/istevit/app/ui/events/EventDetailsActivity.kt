package `in`.istevit.app.ui.events

import `in`.istevit.app.R
import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.ActivityEventDetailsBinding
import android.app.*
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class EventDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityEventDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)

            event = intent.getSerializableExtra("eventItem") as EventDetailsModel?

//            when (event?.filter) {
//                "completed" -> {
//                    timeTitle.visibility = View.GONE
//                    timeTV.visibility = View.GONE
//                    button.text = "Watch Now!"
//                }
//                "upcoming" -> {
//                    timeTitle.visibility = View.VISIBLE
//                    timeTV.visibility = View.VISIBLE
//                    button.text = "RSVP"
////                    scheduleNotification()
//                }
//                "ongoing" -> {
//                    timeTitle.visibility = View.VISIBLE
//                    timeTV.visibility = View.VISIBLE
//                    button.text = "Join In!"
//                }
//            }

            if (event?.link != null) {
                timeTitle.visibility = View.GONE
                timeTV.visibility = View.GONE
                button.text = "Watch Now!"
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        @BindingAdapter("loadEventImage")
        @JvmStatic
        fun loadEventImage(view: ImageView, url: String) {
            Glide.with(view).load(url).centerCrop().into(view)
        }
    }
}