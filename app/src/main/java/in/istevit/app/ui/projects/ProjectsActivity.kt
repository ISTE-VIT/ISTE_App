package `in`.istevit.app.ui.projects

import `in`.istevit.app.adapters.ProjectsAdapter
import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.databinding.ActivityProjectsBinding
import `in`.istevit.app.ui.WebviewActivity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager

class ProjectsActivity : AppCompatActivity(),  ProjectOnClickCallback{
    lateinit var binding: ActivityProjectsBinding
    lateinit var adapter: ProjectsAdapter
    private var projectsList = mutableListOf<ProjectsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ProjectsAdapter(this).also { it.setCallback(this) }
        binding.projectsRecview.adapter = adapter
        binding.projectsRecview.layoutManager = GridLayoutManager(this, 2)

        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        projectsList.add(ProjectsModel("https://thumbs.dreamstime.com/b/beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon-national-park-thailand-36703721.jpg", "https://github.com/andremion/Floating-Navigation-View"))
        adapter.submitList(projectsList)
    }

    override fun onProjectClick(item: ProjectsModel) {
        val intent = Intent(this, WebviewActivity::class.java)
        intent.putExtra("url", item.link)
        startActivity(intent)
    }
}