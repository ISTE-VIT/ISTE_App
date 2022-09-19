package `in`.istevit.app

import `in`.istevit.app.adapters.ResourcesAdapter
import `in`.istevit.app.data.model.ResourcesData
import `in`.istevit.app.databinding.FragmentResourcesBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

class ResourcesFragment : Fragment() {
    lateinit var binding: FragmentResourcesBinding
    lateinit var adapter: ResourcesAdapter
    private var resourcesList = mutableListOf<ResourcesData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResourcesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ResourcesAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Machine Learning"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "App Dev"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Web Dev"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Competitive Coding"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Electronics and Hardware"))
        resourcesList.add(ResourcesData(R.drawable.ic_gallery, "Design"))
        adapter.submitList(resourcesList)
    }
}