package `in`.istevit.app.ui.resources

import `in`.istevit.app.R
import `in`.istevit.app.adapters.ResourcesAdapter
import `in`.istevit.app.data.model.ResourcesData
import `in`.istevit.app.databinding.ActivityResourcesBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class ResourcesActivity : AppCompatActivity() {
    lateinit var binding: ActivityResourcesBinding
    lateinit var adapter: ResourcesAdapter
    private var resourcesList = mutableListOf<ResourcesData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ResourcesAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Machine Learning"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "App Dev"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Web Dev"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Competitive Coding"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Electronics and Hardware"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Design"))
        adapter.submitList(resourcesList)
    }
}