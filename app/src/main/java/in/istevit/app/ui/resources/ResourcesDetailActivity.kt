package `in`.istevit.app.ui.resources

import `in`.istevit.app.adapters.ResourcesDetailsAdapter
import `in`.istevit.app.data.model.resources.OgpViewModel
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.data.model.resources.ResourcesLinksData
import `in`.istevit.app.databinding.ActivityResourcesDetailBinding
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide

class ResourcesDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityResourcesDetailBinding
    private lateinit var resData: ResourcesDetailModel
    private lateinit var ogpViewModel: OgpViewModel
    private lateinit var adapter: ResourcesDetailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourcesDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ogpViewModel = ViewModelProvider(this)[OgpViewModel::class.java]
        resData = ResourcesDetailModel(title = "App Dev", roadmap = "https://images.unsplash.com/photo-1526512340740-9217d0159da9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dmVydGljYWx8ZW58MHx8MHx8&w=1000&q=80", topics = mutableListOf(ResourcesLinksData(topic = "first", links = mutableListOf("https://github.com/Baseflow/PhotoView", "https://github.com/Priyansh-Kedia/OpenGraphParser")), ResourcesLinksData(topic = "Second", links = mutableListOf("https://github.com/Baseflow/PhotoView", "https://github.com/Priyansh-Kedia/OpenGraphParser")), ResourcesLinksData(topic = "Third", links = mutableListOf("https://github.com/Baseflow/PhotoView", "https://github.com/Priyansh-Kedia/OpenGraphParser"))))

        adapter = ResourcesDetailsAdapter()
        binding.resourcesRecView.adapter = adapter
        binding.resourcesRecView.layoutManager = LinearLayoutManager(this)

        ogpViewModel.fetchOgpData(resData)
        ogpViewModel.ogpLiveData.observe(this) {
            adapter.submitList(it.toMutableList())
            binding.apply {
                imageView.visibility = View.VISIBLE
                textView11.visibility = View.VISIBLE
                progressCircular.visibility = View.GONE
            }
        }

        binding.resourcesItem = resData
        Glide.with(binding.imageView)
            .load(resData.roadmap)
            .centerCrop()
            .into(binding.imageView)
    }
}