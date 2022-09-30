package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.resources.ResourcesLinksData
import `in`.istevit.app.databinding.SingleResourcesDetailItemBinding
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ResourcesDetailsAdapter:ListAdapter<ResourcesLinksData, ResourcesDetailsAdapter.ItemViewHolder>(DiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleResourcesDetailItemBinding = SingleResourcesDetailItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<ResourcesLinksData>() {
        override fun areItemsTheSame(oldItem: ResourcesLinksData, newItem: ResourcesLinksData): Boolean {
            return oldItem.topic == newItem.topic
        }

        override fun areContentsTheSame(oldItem: ResourcesLinksData, newItem: ResourcesLinksData): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleResourcesDetailItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: ResourcesLinksData){
            binding.apply {
                resLinksItem = item

                val adapter = ResourcesLinksAdapter()
                recyclerView.adapter = adapter
                recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
                adapter.submitList(item.links)
            }
        }
    }
}