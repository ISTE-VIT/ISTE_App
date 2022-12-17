package `in`.istevit.app.ui.resources

import `in`.istevit.app.adapters.ResourcesDetailsAdapter
import `in`.istevit.app.data.model.resources.ResourcesDetailModel
import `in`.istevit.app.databinding.ActivityResourcesDetailBinding
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.viven.imagezoom.ImageZoomHelper
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResourcesDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityResourcesDetailBinding
    private lateinit var resData: ResourcesDetailModel
    private lateinit var ogpViewModel: OgpViewModel
    private lateinit var resViewModel: ResourcesViewModel
    private lateinit var adapter: ResourcesDetailsAdapter
    private lateinit var imageZoomHelper: ImageZoomHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResourcesDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent?.getStringExtra("title")
        Log.d("ResourcesDetailActivity.kt", "$title")

        imageZoomHelper = ImageZoomHelper(this)

        ogpViewModel = ViewModelProvider(this)[OgpViewModel::class.java]
        resViewModel = ViewModelProvider(this)[ResourcesViewModel::class.java]

        resViewModel.getResources(title.toString())
        resViewModel.resourcesList.observe(this){
            resData = it[0]
            ogpViewModel.fetchOgpData(resData)
            binding.resourcesItem = resData
            Glide.with(binding.imageView)
                .load(resData.roadmap)
                .centerCrop()
                .into(binding.imageView)
        }

        adapter = ResourcesDetailsAdapter()
        binding.resourcesRecView.adapter = adapter
        binding.resourcesRecView.layoutManager = LinearLayoutManager(this)

        ogpViewModel.ogpLiveData.observe(this) {
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