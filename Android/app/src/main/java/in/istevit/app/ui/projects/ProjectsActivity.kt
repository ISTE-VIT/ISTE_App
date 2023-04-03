package `in`.istevit.app.ui.projects

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.adapters.ProjectsAdapter
import `in`.istevit.app.data.model.ProjectsModel
import `in`.istevit.app.databinding.ActivityProjectsBinding
import `in`.istevit.app.ui.WebviewActivity
import `in`.istevit.app.util.Result

@AndroidEntryPoint
class ProjectsActivity : AppCompatActivity(), ProjectOnClickCallback {
    lateinit var binding: ActivityProjectsBinding
    lateinit var adapter: ProjectsAdapter

    private val viewModel by lazy {
        ViewModelProvider(this)[ProjectsViewmodel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ProjectsAdapter(this).also { it.setCallback(this) }
        binding.projectsRecview.adapter = adapter
        binding.projectsRecview.layoutManager = GridLayoutManager(this, 2)

        viewModel.projectsList.observe(this) {
            when (it) {
                is Result.Loading -> {
                    binding.progressCircular.visibility = View.VISIBLE
                    binding.errorLayout.visibility = View.GONE
                }
                is Result.Success -> {
                    adapter.submitList(it.data)
                    binding.progressCircular.visibility = View.GONE
                }

                else -> {
                    binding.progressCircular.visibility = View.GONE
                    binding.errorLayout.visibility = View.VISIBLE
                }
            }
        }

        binding.retryBTN.setOnClickListener {
            viewModel.fetchProjects()
        }
    }

    override fun onProjectClick(item: ProjectsModel) {
        val intent = Intent(this, WebviewActivity::class.java)
        intent.putExtra("url", item.link)
        startActivity(intent)
    }
}