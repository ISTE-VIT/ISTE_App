package `in`.istevit.app.ui.flagship

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import `in`.istevit.app.R
import `in`.istevit.app.adapters.TracksAdapter
import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.databinding.ActivityFlagshipDetailsBinding

class FlagshipDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityFlagshipDetailsBinding
    lateinit var adapter: TracksAdapter
    private var tracksList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlagshipDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.getSerializableExtra("model")
        binding.flagshipDetailsItem = item as FlagshipModel?

        if(item?.tracks?.isEmpty() == true) {
            binding.tracksHeading.text = "${item?.eventName} Gallery"
            tracksList.addAll(item?.gallery?.toMutableList()!!)
        } else {
            binding.tracksHeading.text = "${item?.eventName} Tracks"
            tracksList.addAll(item?.tracks?.toMutableList()!!)
        }

        adapter = TracksAdapter(tracksList)
        binding.tracksRecView.adapter = adapter
        binding.tracksRecView.layoutManager = GridLayoutManager(this, 2)
        adapter.notifyDataSetChanged()

        Glide.with(binding.imageView3)
            .load(item?.image)
            .centerCrop()
            .placeholder(R.drawable.placeholder_image)
            .into(binding.imageView3)
    }
}