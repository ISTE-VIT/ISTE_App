package `in`.istevit.app.ui.announcements

import `in`.istevit.app.adapters.AnnouncementsAdapter
import `in`.istevit.app.adapters.CarouselAdapter
import `in`.istevit.app.data.model.home.HomeCarouselData
import `in`.istevit.app.databinding.FragmentAnnouncementsBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class AnnouncementsFragment : Fragment() {
    lateinit var binding: FragmentAnnouncementsBinding
    private lateinit var carouselAdapter: CarouselAdapter
    private lateinit var announcementsAdapter: AnnouncementsAdapter
    private var carouselList = mutableListOf<HomeCarouselData>()
    lateinit var viewModel: AnnouncementsViewModel
    private lateinit var carouselLayoutManager: LinearLayoutManager
    private lateinit var announcementsLayoutManager: LinearLayoutManager

    private var timer: Timer? = null
    private var timerTask: TimerTask? = null
    private var position = 0

    private var announcementsLoaded = false;
    private var carouselLoaded = false;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnnouncementsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        carouselAdapter = CarouselAdapter(requireContext())
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.carouselRecview)

        binding.carouselRecview.adapter = carouselAdapter
        carouselLayoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.carouselRecview.layoutManager = carouselLayoutManager
        binding.carouselRecview.smoothScrollBy(5, 0)

        announcementsAdapter = AnnouncementsAdapter(requireContext())
        binding.announcementsRecview.adapter = announcementsAdapter
        announcementsLayoutManager = LinearLayoutManager(requireContext())
        binding.announcementsRecview.layoutManager = announcementsLayoutManager

        viewModel = ViewModelProvider(requireActivity())[AnnouncementsViewModel::class.java]

        if(viewModel.announcementsList.value != null && viewModel.carouselList.value != null){
            announcementsAdapter.submitList(viewModel.announcementsList.value)
            carouselList = viewModel.carouselList.value!!.toMutableList()
            carouselAdapter.submitList(carouselList)
            isAnnouncementsLoaded()
        } else {
            viewModel.fetchAnnouncements()
            viewModel.fetchCarouselData()
        }

        viewModel.announcementsList.observe(viewLifecycleOwner) {
            announcementsAdapter.submitList(it.toMutableList())
            announcementsLoaded = true
            isAnnouncementsLoaded()
        }

        viewModel.carouselList.observe(viewLifecycleOwner) {
            carouselList = it.toMutableList()
            carouselAdapter.submitList(carouselList)
            carouselLoaded = true
            isAnnouncementsLoaded()
        }

        binding.carouselRecview.setOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == 1) {
                    stopAutoScrollCarousel()
                } else if (newState == 0) {
                    position = carouselLayoutManager.findFirstCompletelyVisibleItemPosition()
                    runAutoScrollingCarousel()
                }
            }
        })
    }

    fun runAutoScrollingCarousel(){
        if (timer == null && timerTask == null) {
            timer = Timer()
            timerTask = object : TimerTask() {
                override fun run() {
                    if (position == carouselList.size - 1) {
                        binding.carouselRecview.post {
                            position = 0
                            binding.carouselRecview.smoothScrollToPosition(position)
                            binding.carouselRecview.smoothScrollBy(5, 0)
                        }
                    } else {
                        position++
                        binding.carouselRecview.smoothScrollToPosition(position)
                    }
                }
            }
            timer!!.schedule(timerTask, 4000, 4000)
        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//
//        val gson = Gson()
//        val json = gson.toJson(carouselList)
//        outState.putString("Carousel_data", json)
//    }

//    override fun onViewStateRestored(savedInstanceState: Bundle?) {
//        super.onViewStateRestored(savedInstanceState)
//
//        if(savedInstanceState != null){
//            val json = savedInstanceState.getString("Carousel_data")
//            if(json!!.isNotEmpty()){
//                val gson = Gson()
//                val cList = gson.fromJson<String>(json, HomeCarouselData::class.java)
//                Log.d("TAG", cList.toString())
//            }
//        }
//    }

    fun stopAutoScrollCarousel(){
        if (timer != null && timerTask != null) {
            timerTask!!.cancel()
            timer!!.cancel()
            timer = null
            timerTask = null
            position = carouselLayoutManager.findFirstCompletelyVisibleItemPosition()
        }
    }

    private fun isAnnouncementsLoaded(){
        if(announcementsLoaded && carouselLoaded){
            binding.apply {
                progressCircular.visibility = View.GONE
                announcementsTV.visibility = View.VISIBLE
                announcementsRecview.visibility = View.VISIBLE
                carouselRecview.visibility = View.VISIBLE
            }
        }
    }
}