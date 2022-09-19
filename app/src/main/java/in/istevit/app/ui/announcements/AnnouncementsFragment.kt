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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnnouncementsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this)[AnnouncementsViewModel::class.java]
        viewModel.fetchAnnouncements()
        viewModel.fetchCarouselData()

        viewModel.announcementsList.observe(viewLifecycleOwner) {
            announcementsAdapter.submitList(it.toMutableList())
        }

        viewModel.carouselList.observe(viewLifecycleOwner) {
            carouselList = it.toMutableList()
            carouselAdapter.submitList(carouselList)
        }

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

    fun stopAutoScrollCarousel(){
        if (timer != null && timerTask != null) {
            timerTask!!.cancel()
            timer!!.cancel()
            timer = null
            timerTask = null
            position = carouselLayoutManager.findFirstCompletelyVisibleItemPosition()
        }
    }
}