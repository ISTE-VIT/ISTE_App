package `in`.istevit.app.ui.events

import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.ActivityEventDetailsBinding
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

            event = EventDetailsModel(
                image = intent.getStringExtra("eventImage")!!,
                title = intent.getStringExtra("eventTitle")!!,
                speaker = intent.getStringExtra("eventSpeaker")!!,
                description = intent.getStringExtra("eventDescription")!!,
                link = intent.getStringExtra("eventLink")!!,
                date = intent.getStringExtra("eventDate")!!,
                time = intent.getStringExtra("eventTime")!!,
                platform = intent.getStringExtra("eventPlatform")!!,
                category = intent.getStringExtra("eventCategory")!!
            )

            if(intent.getStringExtra("eventCategory")!! == "completed"){
                timeTitle.visibility = View.GONE
                timeTV.visibility = View.GONE
                rsvpBTN.visibility = View.GONE
                watchBTN.visibility = View.VISIBLE
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object{
        @BindingAdapter("loadEventImage")
        @JvmStatic
        fun loadEventImage(view: ImageView, url: String) {
            Glide.with(view).load(url).centerCrop().into(view)
        }
    }
}