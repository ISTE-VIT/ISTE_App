package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.databinding.SingleAnnouncementsItemBinding
import `in`.istevit.app.ui.blogs.BlogDetailsActivity
import `in`.istevit.app.ui.events.EventDetailsActivity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AnnouncementsAdapter(val context: Context): ListAdapter<HomeAnnouncementsData, AnnouncementsAdapter.ItemViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = SingleAnnouncementsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<HomeAnnouncementsData>() {
        override fun areItemsTheSame(oldItem: HomeAnnouncementsData, newItem: HomeAnnouncementsData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: HomeAnnouncementsData, newItem: HomeAnnouncementsData): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleAnnouncementsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HomeAnnouncementsData){
            binding.apply {
                listItem = item
                announcementsRoot.setOnClickListener {
                    if(item.type == "blog"){
                        val mIntent = Intent(announcementsRoot.context, BlogDetailsActivity::class.java)
                        mIntent.putExtra("blogTitle", item.title)
                        mIntent.putExtra("blogDescription", item.description)
                        mIntent.putExtra("blogAuthor", item.author)
                        mIntent.putExtra("blogImage", item.image)
                        mIntent.putExtra("blogLink", item.link)
                        mIntent.putExtra("blogDate", item.date)
                        announcementsRoot.context.startActivity(mIntent)
                    } else if(item.type == "event"){
                        val mIntent = Intent(announcementsRoot.context, EventDetailsActivity::class.java)
                        mIntent.putExtra("eventTitle", item.title)
                        mIntent.putExtra("eventDescription", item.description)
                        mIntent.putExtra("eventImage", item.image)
                        mIntent.putExtra("eventSpeaker", item.author)
                        mIntent.putExtra("eventLink", item.link)
                        mIntent.putExtra("eventDate", item.date)
                        mIntent.putExtra("eventTime", item.time)
                        mIntent.putExtra("eventPlatform", item.platform)
                        mIntent.putExtra("eventCategory", item.category)
                        announcementsRoot.context.startActivity(mIntent)
                    }
                }
            }
        }
    }
}

@BindingAdapter("loadAnnouncementsImage")
fun loadAnnouncementsImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .centerCrop()
        .into(item_imageView)
}