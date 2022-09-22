package `in`.istevit.app.ui.events

import `in`.istevit.app.R
import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.ActivityEventDetailsBinding
import `in`.istevit.app.util.channelID
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class EventDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityEventDetailsBinding
    private val notificationManager by lazy {
        getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)

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

            rsvpBTN.setOnClickListener {
                scheduleNotification()
            }
        }
    }

    private fun scheduleNotification() {
        TODO("Not yet implemented")
    }

    private fun createChannels(channelId: String, channelName: String, channelDescription: String, importance: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                channelName,
                importance
            ).apply {
                description = channelDescription
                enableLights(true)
                enableVibration(true)
                setShowBadge(true)
                setBypassDnd(true)
                lockscreenVisibility = Notification.VISIBILITY_PUBLIC
            }
            notificationManager.createNotificationChannel(channel)
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