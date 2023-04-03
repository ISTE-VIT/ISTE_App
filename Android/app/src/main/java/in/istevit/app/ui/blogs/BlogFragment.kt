package `in`.istevit.app.ui.blogs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.R
import `in`.istevit.app.adapters.BlogsAdapter
import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.databinding.FragmentBlogBinding
import `in`.istevit.app.util.Result

@AndroidEntryPoint
class BlogFragment : Fragment(), BlogOnCLickCallback {
    lateinit var binding: FragmentBlogBinding
    private var blogsList = mutableListOf<BlogDetailsModel>()
    private lateinit var blogAdapter: BlogsAdapter
    private lateinit var blogLayoutManager: LinearLayoutManager
    private var chId: Int = 1

    private val viewModel by lazy {
        ViewModelProvider(requireActivity())[BlogsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlogBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        blogAdapter = BlogsAdapter(requireContext()).also { it.setCallback(this) }
        blogLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = blogAdapter
        binding.recyclerView.layoutManager = blogLayoutManager

        binding.retryBTN.setOnClickListener {
            viewModel.fetchBlogs()
        }

        if (viewModel.blogsList.value == null) {
            viewModel.fetchBlogs()
        } else {
            when (val res = viewModel.blogsList.value) {
                is Result.Success -> blogsList.addAll(res.data)
                is Result.Loading -> Unit
                else -> viewModel.fetchBlogs()
            }
            blogAdapter.submitList(blogsList)
            binding.progressCircular.visibility = View.GONE
        }

        viewModel.blogsList.observe(viewLifecycleOwner) {
            toggleLoading(it)

            when (it) {
                is Result.Loading -> {
                    binding.errorLayout.visibility = View.GONE
                    binding.chipAll.isCheckable = false
                    binding.chipRecents.isCheckable = false
                }
                is Result.Success -> {
                    blogsList.addAll(it.data)
                    blogAdapter.submitList(blogsList)
                    binding.chipAll.isCheckable = true
                    binding.chipRecents.isCheckable = true
                }
                else -> {
                    binding.errorLayout.visibility = View.VISIBLE
                    binding.chipAll.isCheckable = false
                    binding.chipRecents.isCheckable = false
                }
            }
        }

        binding.chipGroup.setOnCheckedChangeListener { _, checkedId ->
            run {
                if (chId != checkedId) {
                    when (checkedId) {
                        R.id.chip_all -> {
                            blogAdapter.submitList(blogsList)
                            binding.animationView.visibility = View.GONE
                        }
                        R.id.chip_recents -> {
                            var temp = blogsList.filter { it.filter == "recents" }
                            if (temp.isEmpty()) {
                                binding.animationView.visibility = View.VISIBLE
                                binding.emptyTV.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                                binding.emptyTV.visibility = View.GONE
                            }
                            blogAdapter.submitList(temp.toMutableList())
                        }
                    }
                    chId = checkedId
                }
            }
        }
    }

    private fun toggleLoading(result: Result<*>) {
        binding.progressCircular.isVisible = result is Result.Loading
    }

    override fun onClick(item: BlogDetailsModel) {
        val mIntent = Intent(requireContext(), BlogDetailsActivity::class.java)
        mIntent.putExtra("blogItem", item)
        startActivity(mIntent)
    }
}