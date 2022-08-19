package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.CarouselData
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

class CarouselAdapter(val context: Context): ListAdapter<CarouselData, CarouselAdapter.ItemViewHolder>(DiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = SingleCarouselItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<CarouselData>() {
        override fun areItemsTheSame(oldItem: CarouselData, newItem: CarouselData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: CarouselData, newItem: CarouselData): Boolean {
            return oldItem == newItem
        }

    }

    inner class ItemViewHolder(private val binding: SingleCarouselItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: CarouselData){
            binding.listItem = item
            binding.carouselMainCard.setOnClickListener {
                Toast.makeText(context, item.title, Toast.LENGTH_LONG).show()
            }
        }
    }
}

@BindingAdapter("loadImage")
fun loadImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .centerCrop()
        .into(item_imageView)
}