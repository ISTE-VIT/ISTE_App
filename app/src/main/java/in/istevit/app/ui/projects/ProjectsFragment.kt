package `in`.istevit.app.ui.projects

import `in`.istevit.app.adapters.ProjectsAdapter
import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.databinding.FragmentProjectsBinding
import `in`.istevit.app.ui.WebviewActivity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager

class ProjectsFragment : Fragment(), ProjectOnClickCallback {
    lateinit var binding: FragmentProjectsBinding
    lateinit var adapter: ProjectsAdapter
    private var projectsList = mutableListOf<ProjectsModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProjectsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ProjectsAdapter(requireContext()).also { it.setCallback(this) }
        binding.projectsRecview.adapter = adapter
        binding.projectsRecview.layoutManager = GridLayoutManager(requireContext(), 2)

        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        adapter.submitList(projectsList)
    }

    override fun onProjectClick(item: ProjectsModel) {
        val intent = Intent(requireContext(), WebviewActivity::class.java)
        intent.putExtra("url", item.link)
        startActivity(intent)
    }
}