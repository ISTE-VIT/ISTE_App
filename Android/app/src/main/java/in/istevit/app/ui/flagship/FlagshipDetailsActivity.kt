package `in`.istevit.app.ui.flagship

import `in`.istevit.app.adapters.TracksAdapter
import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.databinding.ActivityFlagshipDetailsBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide

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

        adapter = TracksAdapter(tracksList)
        binding.tracksRecView.adapter = adapter
        binding.tracksRecView.layoutManager = GridLayoutManager(this, 2)
        tracksList.addAll(item?.tracks?.toMutableList()!!)
        adapter.notifyDataSetChanged()

        Glide.with(binding.imageView3)
            .load(item?.image)
            .centerCrop()
            .into(binding.imageView3)
    }
}