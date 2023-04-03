package `in`.istevit.app.ui.resources

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.viven.imagezoom.ImageZoomHelper
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.R
import `in`.istevit.app.adapters.ResourcesDetailsAdapter
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.databinding.ActivityResourcesDetailBinding
import `in`.istevit.app.util.Result

@AndroidEntryPoint
class ResourcesDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityResourcesDetailBinding
    private lateinit var resData: ResourcesDetailModel
    private lateinit var adapter: ResourcesDetailsAdapter
    private lateinit var imageZoomHelper: ImageZoomHelper

    private val resViewModel by lazy {
        ViewModelProvider(this)[ResourcesViewModel::class.java]
    }

    private val ogpViewModel by lazy {
        ViewModelProvider(this)[OgpViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourcesDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent?.getStringExtra("title")

        imageZoomHelper = ImageZoomHelper(this)

        resViewModel.fetchResources(title.toString())
        resViewModel.resourcesList.observe(this) {
            when (it) {
                is Result.Loading -> {
                    binding.progressCircular.visibility = View.VISIBLE
                    binding.errorLayout.visibility = View.GONE
                }
                is Result.Success -> {
                    resData = it.data[0]
                    ogpViewModel.fetchOgpData(resData)
                    binding.resourcesItem = resData
                    Glide.with(binding.imageView)
                        .load(resData.roadmap)
                        .placeholder(R.drawable.placeholder_image)
                        .centerCrop()
                        .into(binding.imageView)
                }
                else -> {
                    binding.progressCircular.visibility = View.GONE
                    binding.errorLayout.visibility = View.VISIBLE
                }
            }
        }

        binding.retryBTN.setOnClickListener {
            resViewModel.fetchResources(title.toString())
        }

        adapter = ResourcesDetailsAdapter()
        binding.resourcesRecView.adapter = adapter
        binding.resourcesRecView.layoutManager = LinearLayoutManager(this)

        ogpViewModel.ogpLiveData.observe(this) {
            if (it.isEmpty()) {
                binding.progressCircular.visibility = View.GONE
                binding.errorLayout.visibility = View.VISIBLE
            }
            adapter.submitList(it.toMutableList())
            binding.apply {
                imageView.visibility = View.VISIBLE
                textView11.visibility = View.VISIBLE
                progressCircular.visibility = View.GONE
            }
        }

        ImageZoomHelper.setViewZoomable(binding.imageView)
        ImageZoomHelper.setZoom(binding.imageView, true)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return imageZoomHelper.onDispatchTouchEvent(ev) || super.dispatchTouchEvent(ev)
    }
}