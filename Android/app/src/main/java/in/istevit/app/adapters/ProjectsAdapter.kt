package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.databinding.SingleProjectItemBinding
import `in`.istevit.app.ui.projects.ProjectOnClickCallback
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import `in`.istevit.app.R

class ProjectsAdapter(val context: Context): ListAdapter<ProjectsModel,ProjectsAdapter.ItemViewHolder>(DiffUtil()) {

    private lateinit var callback: ProjectOnClickCallback

    fun setCallback(callback: ProjectOnClickCallback){
        this.callback = callback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleProjectItemBinding = SingleProjectItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<ProjectsModel>() {
        override fun areItemsTheSame(oldItem: ProjectsModel, newItem: ProjectsModel): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: ProjectsModel, newItem: ProjectsModel): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleProjectItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: ProjectsModel){
            binding.projectItem = item
            binding.callback = callback
        }
    }
}

@BindingAdapter("loadProjectImage")
fun loadProjectImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .placeholder(R.drawable.placeholder_image)
        .centerCrop()
        .into(item_imageView)
}

@BindingAdapter("projectsCallback", "projectsData")
fun projectsCallback(v: ImageView, callback: ProjectOnClickCallback, projectsData: ProjectsModel){
    v.setOnClickListener {
        callback.onProjectClick(projectsData)
    }
}