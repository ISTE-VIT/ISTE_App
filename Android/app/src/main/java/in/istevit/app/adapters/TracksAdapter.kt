package `in`.istevit.app.adapters

import `in`.istevit.app.databinding.SingleTracksItemBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class TracksAdapter(var tracks: List<String>): RecyclerView.Adapter<TracksAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: SingleTracksItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TracksAdapter.ItemViewHolder {
        val binding = SingleTracksItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Glide.with(holder.binding.imageView)
            .load(tracks[position])
            .into(holder.binding.imageView)
    }

    override fun getItemCount(): Int {
        return tracks.size
    }
}