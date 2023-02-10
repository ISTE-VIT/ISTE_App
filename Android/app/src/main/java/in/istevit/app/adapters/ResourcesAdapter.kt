package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.resources.ResourcesData
import `in`.istevit.app.databinding.SingleResourcesItemBinding
import `in`.istevit.app.ui.resources.ResourcesDetailActivity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ResourcesAdapter: ListAdapter<ResourcesData, ResourcesAdapter.ItemViewHolder>(DiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleResourcesItemBinding = SingleResourcesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<ResourcesData>() {
        override fun areItemsTheSame(oldItem: ResourcesData, newItem: ResourcesData): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: ResourcesData, newItem: ResourcesData): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleResourcesItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: ResourcesData){
            binding.apply {
                imageView.setImageResource(item.image)
                title.text = item.title
                constrainLayout.setOnClickListener {
                    constrainLayout.context.startActivity(Intent(constrainLayout.context, ResourcesDetailActivity::class.java).putExtra("title", item.title))
                }
            }
        }
    }
}