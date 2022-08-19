package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.AnnouncementsData
import `in`.istevit.app.data.model.CarouselData
import `in`.istevit.app.databinding.SingleAnnouncementsItemBinding
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AnnouncementsAdapter(val context: Context): ListAdapter<AnnouncementsData, AnnouncementsAdapter.ItemViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = SingleAnnouncementsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<AnnouncementsData>() {
        override fun areItemsTheSame(oldItem: AnnouncementsData, newItem: AnnouncementsData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: AnnouncementsData, newItem: AnnouncementsData): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleAnnouncementsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: AnnouncementsData){
            binding.listItem = item
            binding.announcementsRoot.setOnClickListener {
                Toast.makeText(context, item.title, Toast.LENGTH_LONG).show()
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