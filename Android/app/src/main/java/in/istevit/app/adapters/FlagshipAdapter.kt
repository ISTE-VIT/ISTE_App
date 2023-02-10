package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.databinding.SingleFlagshipItemBinding
import `in`.istevit.app.ui.flagship.FlagshipOnClickCallback
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FlagshipAdapter(val context: Context): ListAdapter<FlagshipModel, FlagshipAdapter.ItemViewHolder>(DiffUtil()) {
    lateinit var flagshipCallback: FlagshipOnClickCallback

    fun setCallback(flagshipCallback: FlagshipOnClickCallback){
        this.flagshipCallback = flagshipCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleFlagshipItemBinding = SingleFlagshipItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<FlagshipModel>() {
        override fun areItemsTheSame(oldItem: FlagshipModel, newItem: FlagshipModel): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: FlagshipModel, newItem: FlagshipModel): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleFlagshipItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: FlagshipModel){
            binding.flagshipItem = item
            binding.callback = flagshipCallback
        }
    }
}

@BindingAdapter("loadFlagshipImage")
fun loadFlagshipImage(item_imageView: ImageView, url: String){
    Glide.with(item_imageView)
        .load(url)
        .centerCrop()
        .into(item_imageView)
}

@BindingAdapter("flagshipCallback", "flagshipData")
fun flagshipCallback(v: ImageView, callback: FlagshipOnClickCallback, flagshipData: FlagshipModel){
    v.setOnClickListener {
        callback.onClick(flagshipData)
    }
}