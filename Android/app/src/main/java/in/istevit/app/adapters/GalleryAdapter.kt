package `in`.istevit.app.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import `in`.istevit.app.R
import `in`.istevit.app.data.model.GalleryModel
import `in`.istevit.app.databinding.SingleGalleryItemBinding

class GalleryAdapter : ListAdapter<GalleryModel, GalleryAdapter.ItemViewHolder>(DiffUtil()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleGalleryItemBinding = SingleGalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<GalleryModel>() {
        override fun areItemsTheSame(oldItem: GalleryModel, newItem: GalleryModel): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: GalleryModel, newItem: GalleryModel): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleGalleryItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: GalleryModel){
            binding.galleryItem = item
        }
    }
}

@BindingAdapter("loadGalleryImage")
fun loadGalleryImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .placeholder(R.drawable.placeholder_image)
        .into(item_imageView)
}