package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.home.HomeCarouselData
import `in`.istevit.app.databinding.SingleCarouselItemBinding
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CarouselAdapter(val context: Context): ListAdapter<HomeCarouselData, CarouselAdapter.ItemViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = SingleCarouselItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<HomeCarouselData>() {
        override fun areItemsTheSame(oldItem: HomeCarouselData, newItem: HomeCarouselData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: HomeCarouselData, newItem: HomeCarouselData): Boolean {
            return oldItem == newItem
        }

    }

    inner class ItemViewHolder(private val binding: SingleCarouselItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HomeCarouselData){
            binding.listItem = item
            binding.carouselMainCard.setOnClickListener {
                Toast.makeText(context, item.title, Toast.LENGTH_LONG).show()
            }
        }
    }
}

@BindingAdapter("loadCarouselImage")
fun loadCarouselImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .centerCrop()
        .into(item_imageView)
}