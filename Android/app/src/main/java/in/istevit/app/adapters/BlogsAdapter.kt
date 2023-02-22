package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.databinding.SingleBlogsItemBinding
import `in`.istevit.app.ui.blogs.BlogOnCLickCallback
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import `in`.istevit.app.R

class BlogsAdapter (val context: Context): ListAdapter<BlogDetailsModel, BlogsAdapter.ItemViewHolder>(DiffUtil()) {

    private lateinit var callback: BlogOnCLickCallback

    fun setCallback(callback: BlogOnCLickCallback){
        this.callback = callback
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BlogsAdapter.ItemViewHolder {
        val binding: SingleBlogsItemBinding = SingleBlogsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BlogsAdapter.ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<BlogDetailsModel>() {
        override fun areItemsTheSame(oldItem: BlogDetailsModel, newItem: BlogDetailsModel): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: BlogDetailsModel, newItem: BlogDetailsModel): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleBlogsItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: BlogDetailsModel) {
            binding.blog = item
            binding.callback = callback
        }
    }
}

@BindingAdapter("loadBlogsImage")
fun loadBlogsImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .placeholder(R.drawable.placeholder_image)
        .centerCrop()
        .into(item_imageView)
}

@BindingAdapter("blogsCallback", "blogsData")
fun blogsCallback(v: Button, callback: BlogOnCLickCallback, blogsData: BlogDetailsModel){
    v.setOnClickListener {
        callback.onClick(blogsData)
    }
}