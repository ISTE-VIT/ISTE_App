package `in`.istevit.app.ui.events

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.R
import `in`.istevit.app.adapters.EventsAdapter
import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.FragmentEventBinding
import `in`.istevit.app.util.Result

@AndroidEntryPoint
class EventFragment : Fragment(), EventOnClickCallback{
    lateinit var binding: FragmentEventBinding
    private var eventsList = mutableListOf<EventDetailsModel>()
    private lateinit var eventAdapter: EventsAdapter
    private lateinit var eventLayoutManager: LinearLayoutManager
    private var chId: Int = 1

    private val viewModel by lazy {
        ViewModelProvider(requireActivity())[EventsViewmodel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEventBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        eventAdapter = EventsAdapter(requireContext()).also { it.setCallback(this) }
        eventLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = eventAdapter
        binding.recyclerView.layoutManager = eventLayoutManager

        if (viewModel.eventsList.value == null) {
            viewModel.fetchEvents()
        } else {
            when (val res = viewModel.eventsList.value!!) {
                is Result.Success -> {
                    eventsList.addAll(res.data)
                }

                else -> {
                    viewModel.fetchEvents()
                }
            }
            eventAdapter.submitList(eventsList)
            binding.progressCircular.visibility = View.GONE
        }

        binding.retryBTN.setOnClickListener {
            viewModel.fetchEvents()
        }

        viewModel.eventsList.observe(viewLifecycleOwner) {
            when (it) {
                is Result.Loading -> {
                    binding.progressCircular.visibility = View.VISIBLE
                    binding.errorLayout.visibility = View.GONE
                    binding.chipAll.isCheckable = false
                    binding.chipCompleted.isCheckable = false
                    binding.chipOngoing.isCheckable = false
                    binding.chipUpcoming.isCheckable = false
                }

                is Result.Success -> {
                    eventsList.addAll(it.data)
                    eventAdapter.submitList(eventsList)
                    binding.progressCircular.visibility = View.GONE
                    binding.chipAll.isCheckable = true
                    binding.chipCompleted.isCheckable = true
                    binding.chipOngoing.isCheckable = true
                    binding.chipUpcoming.isCheckable = true
                }

                else -> {
                    binding.progressCircular.visibility = View.GONE
                    binding.errorLayout.visibility = View.VISIBLE
                    binding.chipAll.isCheckable = false
                    binding.chipCompleted.isCheckable = false
                    binding.chipOngoing.isCheckable = false
                    binding.chipUpcoming.isCheckable = false
                }
            }
        }

        binding.chipGroup.setOnCheckedChangeListener{
                _, checkedId ->
            run {
                if(chId != checkedId){
                    when(checkedId) {
                        R.id.chip_all -> {
                            eventAdapter.submitList(eventsList)
                            binding.animationView.visibility = View.GONE
                        }
                        R.id.chip_ongoing -> {
                            var temp = eventsList.filter { it.filter == "ongoing" }
                            eventAdapter.submitList(temp.toMutableList())
                            if(temp.isEmpty()){
                                binding.animationView.visibility = View.VISIBLE
                                binding.emptyTV.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                                binding.emptyTV.visibility = View.GONE
                            }
                        }
                        R.id.chip_completed -> {
                            var temp = eventsList.filter { it.filter == "completed" }
                            eventAdapter.submitList(temp.toMutableList())
                            if(temp.isEmpty()){
                                binding.animationView.visibility = View.VISIBLE
                                binding.emptyTV.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                                binding.emptyTV.visibility = View.GONE
                            }
                        }
                        R.id.chip_upcoming -> {
                            var temp = eventsList.filter { it.filter == "upcoming" }
                            eventAdapter.submitList(temp.toMutableList())
                            if(temp.isEmpty()){
                                binding.animationView.visibility = View.VISIBLE
                                binding.emptyTV.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                                binding.emptyTV.visibility = View.GONE
                            }
                        }
                    }
                    chId = checkedId
                }
            }
        }
    }

    override fun onClick(item: EventDetailsModel) {
        val mIntent = Intent(requireContext(), EventDetailsActivity::class.java)
        mIntent.putExtra("eventItem", item)
        startActivity(mIntent)
    }
}