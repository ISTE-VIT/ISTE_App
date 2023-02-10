package `in`.istevit.app.ui.projects

import `in`.istevit.app.adapters.ProjectsAdapter
import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.databinding.ActivityProjectsBinding
import `in`.istevit.app.ui.WebviewActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProjectsActivity : AppCompatActivity(),  ProjectOnClickCallback{
    lateinit var binding: ActivityProjectsBinding
    lateinit var adapter: ProjectsAdapter
    lateinit var viewmodel: ProjectsViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel = ViewModelProvider(this)[ProjectsViewmodel::class.java]
        viewmodel.getProjects()
        viewmodel.projectsList.observe(this){
            binding.progressCircular.visibility = View.GONE
            adapter.submitList(it.toMutableList())
        }

        adapter = ProjectsAdapter(this).also { it.setCallback(this) }
        binding.projectsRecview.adapter = adapter
        binding.projectsRecview.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onProjectClick(item: ProjectsModel) {
        val intent = Intent(this, WebviewActivity::class.java)
        intent.putExtra("url", item.link)
        startActivity(intent)
    }
}