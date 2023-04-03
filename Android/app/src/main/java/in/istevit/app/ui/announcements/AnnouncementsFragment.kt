package `in`.istevit.app.ui.announcements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.adapters.AnnouncementsAdapter
import `in`.istevit.app.adapters.CarouselAdapter
import `in`.istevit.app.data.model.home.HomeAnnouncementsData
import `in`.istevit.app.data.model.home.HomeCarouselData
import `in`.istevit.app.databinding.FragmentAnnouncementsBinding
import `in`.istevit.app.util.Result
import java.util.*

@AndroidEntryPoint
class AnnouncementsFragment : Fragment() {
    lateinit var binding: FragmentAnnouncementsBinding
    private lateinit var carouselAdapter: CarouselAdapter
    private lateinit var announcementsAdapter: AnnouncementsAdapter
    private var carouselList = mutableListOf<HomeCarouselData>()
    private var announcementsList = mutableListOf<HomeAnnouncementsData>()
    private lateinit var carouselLayoutManager: LinearLayoutManager
    private lateinit var announcementsLayoutManager: LinearLayoutManager

    private val viewModel by lazy {
        ViewModelProvider(requireActivity())[AnnouncementsViewModel::class.java]
    }
    private var timer: Timer? = null
    private var timerTask: TimerTask? = null
    private var position = 0

    private var announcementsLoaded = false
    private var carouselLoaded = false

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

        if (viewModel.announcementsList.value != null && viewModel.carouselList.value != null) {
            when (val res = viewModel.carouselList.value!!) {
                is Result.Success -> {
                    carouselList.addAll(res.data)
                }

                else -> {
                    viewModel.fetchCarouselData()
                }
            }
            carouselAdapter.submitList(carouselList)
            binding.progressCircular.visibility = View.GONE

            when(val res = viewModel.announcementsList.value!!) {
                is Result.Success -> {
                    announcementsList.addAll(res.data)
                }

                else -> {
                    viewModel.fetchAnnouncements()
                }
            }
            announcementsAdapter.submitList(announcementsList)
            binding.progressCircular.visibility = View.GONE
        } else {
            viewModel.fetchCarouselData()
            viewModel.fetchAnnouncements()
        }

        binding.retryBTN.setOnClickListener {
            viewModel.fetchAnnouncements()
            viewModel.fetchCarouselData()
        }

        viewModel.announcementsList.observe(viewLifecycleOwner) {
            when (it) {
                is Result.Loading -> {
                    binding.errorLayout.visibility = View.GONE
                    binding.progressCircular.visibility = View.VISIBLE
                }
                is Result.Success -> {
                    announcementsAdapter.submitList(it.data)
                    announcementsLoaded = true
                    isAnnouncementsLoaded()
                }
                else -> {
                    binding.errorLayout.visibility = View.VISIBLE
                    binding.progressCircular.visibility = View.GONE
                }
            }
        }

        viewModel.carouselList.observe(viewLifecycleOwner) {
            when (it) {
                is Result.Loading -> {
                    binding.errorLayout.visibility = View.GONE
                    binding.progressCircular.visibility = View.VISIBLE
                }

                is Result.Success -> {
                    carouselAdapter.submitList(it.data)
                    carouselLoaded = true
                    binding.errorLayout.visibility = View.GONE
                    isAnnouncementsLoaded()
                }

                else -> {
                    binding.errorLayout.visibility = View.VISIBLE
                    binding.progressCircular.visibility = View.GONE
                }
            }
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

    fun runAutoScrollingCarousel() {
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

    fun stopAutoScrollCarousel() {
        if (timer != null && timerTask != null) {
            timerTask!!.cancel()
            timer!!.cancel()
            timer = null
            timerTask = null
            position = carouselLayoutManager.findFirstCompletelyVisibleItemPosition()
        }
    }

    private fun isAnnouncementsLoaded() {
        if (announcementsLoaded && carouselLoaded) {
            binding.apply {
                progressCircular.visibility = View.GONE
                errorLayout.visibility = View.GONE
                announcementsTV.visibility = View.VISIBLE
                announcementsRecview.visibility = View.VISIBLE
                carouselRecview.visibility = View.VISIBLE
            }
        }
    }
}