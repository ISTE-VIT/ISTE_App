package `in`.istevit.app.ui.blogs

import `in`.istevit.app.R
import `in`.istevit.app.adapters.BlogsAdapter
import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.databinding.FragmentBlogBinding
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

class BlogFragment : Fragment(), BlogOnCLickCallback{
    lateinit var binding: FragmentBlogBinding
    lateinit var viewmodel: BlogsViewmodel
    var blogsList = mutableListOf<BlogDetailsModel>()
    private lateinit var blogAdapter: BlogsAdapter
    lateinit var blogLayoutManager: LinearLayoutManager
    private var chId: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlogBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel = ViewModelProvider(this)[BlogsViewmodel::class.java]
        viewmodel.fetchBlogs()
        viewmodel.blogsList.observe(viewLifecycleOwner){
            blogsList = it.toMutableList()
            blogAdapter.submitList(blogsList)
            binding.progressCircular.visibility = View.GONE
        }

        blogAdapter = BlogsAdapter(requireContext()).also { it.setCallback(this) }
        blogLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = blogAdapter
        binding.recyclerView.layoutManager = blogLayoutManager

        binding.chipGroup.setOnCheckedChangeListener{
                _, checkedId ->
            run {
                if(chId != checkedId){
                    when(checkedId) {
                        R.id.chip_all -> {
                            blogAdapter.submitList(blogsList)
                            binding.animationView.visibility = View.GONE
                        }
                        R.id.chip_recents -> {
                            var temp = blogsList.filter { it.filter == "recents" }
                            if(temp.isEmpty()){
                                binding.animationView.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                            }
                            blogAdapter.submitList(temp.toMutableList())
                        }
                    }
                    chId = checkedId
                }
            }
        }
    }

    override fun onClick(item: BlogDetailsModel) {
        val mIntent = Intent(requireContext(), BlogDetailsActivity::class.java)
        mIntent.putExtra("blogItem", item)
        startActivity(mIntent)
    }
}