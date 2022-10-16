package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.resources.OpenGraphResult
import `in`.istevit.app.databinding.SingleResourcesInnerItemBinding
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ResourcesLinksAdapter: ListAdapter<OpenGraphResult, ResourcesLinksAdapter.ItemViewHolder>(DiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleResourcesInnerItemBinding = SingleResourcesInnerItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<OpenGraphResult>() {
        override fun areItemsTheSame(oldItem: OpenGraphResult, newItem: OpenGraphResult): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: OpenGraphResult, newItem: OpenGraphResult): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleResourcesInnerItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: OpenGraphResult){
            binding.apply {
                ogpItem = item
                title.setOnClickListener {
                    title.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(item.url)))
                }
                Glide.with(imageView)
                    .load(item.image)
                    .centerCrop()
                    .into(imageView)
            }
        }
    }
}
