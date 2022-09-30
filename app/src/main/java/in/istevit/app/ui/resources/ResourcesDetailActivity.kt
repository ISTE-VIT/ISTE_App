package `in`.istevit.app.ui.resources

import `in`.istevit.app.adapters.ResourcesDetailsAdapter
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.data.model.resources.ResourcesLinksData
import `in`.istevit.app.databinding.ActivityResourcesDetailBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide

class ResourcesDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityResourcesDetailBinding
    private lateinit var resData: ResourcesDetailModel
    private lateinit var adapter: ResourcesDetailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourcesDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resData = ResourcesDetailModel(title = "App Dev", roadmap = "https://images.unsplash.com/photo-1526512340740-9217d0159da9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dmVydGljYWx8ZW58MHx8MHx8&w=1000&q=80", topics = mutableListOf(ResourcesLinksData(topic = "first", links = mutableListOf("https://github.com/Baseflow/PhotoView", "https://github.com/Priyansh-Kedia/OpenGraphParser")), ResourcesLinksData(topic = "Second", links = mutableListOf("https://github.com/Baseflow/PhotoView", "https://github.com/Priyansh-Kedia/OpenGraphParser")), ResourcesLinksData(topic = "Third", links = mutableListOf("https://github.com/Baseflow/PhotoView", "https://github.com/Priyansh-Kedia/OpenGraphParser"))))
        binding.resourcesItem = resData
        Glide.with(binding.imageView)
            .load(resData.roadmap)
            .centerCrop()
            .into(binding.imageView)

        adapter = ResourcesDetailsAdapter()
        binding.resourcesRecView.adapter = adapter
        binding.resourcesRecView.layoutManager = LinearLayoutManager(this)
        adapter.submitList(resData.topics)
    }
}