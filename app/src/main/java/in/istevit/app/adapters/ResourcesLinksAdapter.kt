package `in`.istevit.app.adapters

import `in`.istevit.app.data.model.OpenGraphResult
import `in`.istevit.app.databinding.SingleResourcesInnerItemBinding
import `in`.istevit.app.util.Constants
import android.content.Intent
import android.net.Uri
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jsoup.Jsoup

class ResourcesLinksAdapter: ListAdapter<String, ResourcesLinksAdapter.ItemViewHolder>(DiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: SingleResourcesInnerItemBinding = SingleResourcesInnerItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    class DiffUtil: androidx.recyclerview.widget.DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    inner class ItemViewHolder(private val binding: SingleResourcesInnerItemBinding): RecyclerView.ViewHolder(binding.root){
        private val openGraphResult = OpenGraphResult()
        fun bind(item: String){
            val handler = Handler()
            GlobalScope.launch(Dispatchers.IO) {
                try{
                    val response = Jsoup.connect(item)
                        .ignoreContentType(true)
                        .userAgent("Mozilla")
                        .referrer("http://www.google.com")
                        .timeout(100000)
                        .followRedirects(true)
                        .execute()!!
                    val doc = response.parse()
                    val ogTags = doc.select("meta[property^=og:]")
                    when {
                        ogTags.size > 0 ->
                            ogTags.forEachIndexed { index, _ ->
                                val tag = ogTags[index]

                                when (tag.attr("property")) {
                                    "og:image" -> {
                                        openGraphResult.image = (tag.attr("content"))
                                    }
                                    "og:description" -> {
                                        openGraphResult.description = (tag.attr("content"))
                                    }
                                    "og:url" -> {
                                        openGraphResult.url = (tag.attr("content"))
                                    }
                                    "og:title" -> {
                                        openGraphResult.title = (tag.attr("content"))
                                    }
                                    "og:site_name" -> {
                                        openGraphResult.siteName = (tag.attr("content"))
                                    }
                                    "og:type" -> {
                                        openGraphResult.type = (tag.attr("content"))
                                    }
                                }
                            }
                    }

                    val monitor = Runnable {
                        binding.apply {
                            description.text = openGraphResult.description
                            title.text = openGraphResult.title
                            if(openGraphResult.image != ""){
                                Glide.with(imageView)
                                    .load(openGraphResult.image)
                                    .into(imageView)
                            }

                            title.setOnClickListener{
                                title.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(openGraphResult.url)))
                            }
                        }
                    }
                    handler.postDelayed(monitor, 0)
                } catch (e: Exception){
                    Log.d("TAG", e.toString())
                }
            }
        }
    }
}
