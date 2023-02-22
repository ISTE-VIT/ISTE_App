package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.SingleEventsItemBinding
import `in`.istevit.app.ui.events.EventOnClickCallback
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import `in`.istevit.app.R

class EventsAdapter (val context: Context): ListAdapter<EventDetailsModel, EventsAdapter.ItemViewHolder>(DiffUtil()){
    private lateinit var eventOnClickCallback: EventOnClickCallback

    fun setCallback(eventOnClickCallback: EventOnClickCallback){
        this.eventOnClickCallback = eventOnClickCallback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EventsAdapter.ItemViewHolder {
        val binding: SingleEventsItemBinding = SingleEventsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventsAdapter.ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<EventDetailsModel>() {
        override fun areItemsTheSame(oldItem: EventDetailsModel, newItem: EventDetailsModel): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: EventDetailsModel, newItem: EventDetailsModel): Boolean {
            return oldItem == newItem
        }

    }

    inner class ItemViewHolder(private val binding: SingleEventsItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: EventDetailsModel) {
            binding.apply {
                event = item
                callback = eventOnClickCallback
                if(item.filter == "completed"){
                    timeTV.visibility = View.GONE
                    timeText.visibility = View.GONE
                }
            }
        }
    }
}

@BindingAdapter("loadEventsImage")
fun loadEventsImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .placeholder(R.drawable.placeholder_image)
        .centerCrop()
        .into(item_imageView)
}

@BindingAdapter("eventsCallback", "eventsData")
fun eventsCallback(v: Button, callback: EventOnClickCallback, eventsData: EventDetailsModel){
    v.setOnClickListener {
        callback.onClick(eventsData)
    }
}