package `in`.istevit.app.ui.resources

import `in`.istevit.app.R
import `in`.istevit.app.adapters.ResourcesAdapter
import `in`.istevit.app.data.model.resources.ResourcesData
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

        resourcesList.add(ResourcesData(1 ,R.drawable.ic_ai, "Machine Learning"))
        resourcesList.add(ResourcesData(2, R.drawable.ic_app, "App Dev"))
        resourcesList.add(ResourcesData(3, R.drawable.ic_web, "Web Dev"))
        resourcesList.add(ResourcesData(4, R.drawable.ic_cc, "Competitive Coding"))
        resourcesList.add(ResourcesData(5, R.drawable.ic_electronics, "Electronics and Hardware"))
        resourcesList.add(ResourcesData(6, R.drawable.ic_design, "Design"))
        adapter.submitList(resourcesList)
    }
}