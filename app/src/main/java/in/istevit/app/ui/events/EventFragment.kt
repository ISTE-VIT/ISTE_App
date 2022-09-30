package `in`.istevit.app.ui.events

import `in`.istevit.app.R
import `in`.istevit.app.adapters.EventsAdapter
import `in`.istevit.app.data.model.EventDetailsModel
import `in`.istevit.app.databinding.FragmentEventBinding
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip

class EventFragment : Fragment(), EventOnClickCallback{
    lateinit var binding: FragmentEventBinding
    var eventsList = mutableListOf<EventDetailsModel>()
    private lateinit var viewmodel: EventsViewmodel
    private lateinit var eventAdapter: EventsAdapter
    lateinit var eventLayoutManager: LinearLayoutManager
    private var chId: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEventBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewmodel = ViewModelProvider(this)[EventsViewmodel::class.java]
        viewmodel.fetchEvents()
        viewmodel.eventsList.observe(viewLifecycleOwner) {
            eventsList = it.toMutableList()
            eventAdapter.submitList(eventsList)
            binding.progressCircular.visibility = View.GONE
        }

        eventAdapter = EventsAdapter(requireContext()).also { it.setCallback(this) }
        eventLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = eventAdapter
        binding.recyclerView.layoutManager = eventLayoutManager

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
                            } else {
                                binding.animationView.visibility = View.GONE
                            }
                        }
                        R.id.chip_completed -> {
                            var temp = eventsList.filter { it.filter == "completed" }
                            eventAdapter.submitList(temp.toMutableList())
                            if(temp.isEmpty()){
                                binding.animationView.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                            }
                        }
                        R.id.chip_upcoming -> {
                            var temp = eventsList.filter { it.filter == "upcoming" }
                            eventAdapter.submitList(temp.toMutableList())
                            if(temp.isEmpty()){
                                binding.animationView.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
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