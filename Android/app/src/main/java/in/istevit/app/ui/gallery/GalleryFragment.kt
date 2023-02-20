package `in`.istevit.app.ui.gallery

import `in`.istevit.app.adapters.GalleryAdapter
import `in`.istevit.app.databinding.FragmentGalleryBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class GalleryFragment : Fragment() {
    lateinit var binding: FragmentGalleryBinding
    lateinit var galleryAdapter: GalleryAdapter
    private val viewModel by lazy {
        ViewModelProvider(requireActivity())[GalleryViewmodel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGalleryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        galleryAdapter = GalleryAdapter()
        binding.recyclerView.adapter = galleryAdapter
        binding.recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

        viewModel.galleryData.observe(viewLifecycleOwner) {
            galleryAdapter.submitList(it.toMutableList())
            if(it.isNotEmpty()) binding.progressCircular.visibility = View.GONE
        }
    }
}