package `in`.istevit.app.ui.events

import `in`.istevit.app.R
import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.ActivityEventDetailsBinding
import `in`.istevit.app.util.NotificationService
import android.app.*
import android.content.Context
import android.content.Intent
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

            if(event?.link != null){
                timeTitle.visibility = View.GONE
                timeTV.visibility = View.GONE
                button.text = "Watch Now!"
            }
        }
    }

    private fun scheduleNotification() {
        val intent = Intent(applicationContext, NotificationService::class.java)
        val title = binding.event?.title
        val message = "Test Message"
        intent.putExtra("titleExtra", title)
        intent.putExtra("messageExtra", message)
        val pendingIntent = PendingIntent.getBroadcast(applicationContext, 1, intent, PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT)
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
//        val time = getTime()
    }

//    private fun getTime(): Long{
//    }

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