package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.data.model.EventDetailsModel
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
                        val data = BlogDetailsModel(title = item.title, description = item.description, writer = item.author, image = item.image, link = item.link, date = item.date)
                        mIntent.putExtra("blogItem", data)
                        announcementsRoot.context.startActivity(mIntent)
                    } else if(item.type == "event"){
                        val mIntent = Intent(announcementsRoot.context, EventDetailsActivity::class.java)
                        val data = EventDetailsModel(title = item.title, description = item.description, image = item.image, speaker = item.author, link = item.link, date = item.date, time = item.time, platform = item.platform, category = item.category)
                        mIntent.putExtra("eventItem", data)
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