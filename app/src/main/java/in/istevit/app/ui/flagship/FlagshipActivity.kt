package `in`.istevit.app.ui.flagship

import `in`.istevit.app.adapters.FlagshipAdapter
import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.databinding.ActivityFlagshipBinding
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

class FlagshipActivity : AppCompatActivity(), FlagshipOnClickCallback{
    lateinit var binding: ActivityFlagshipBinding
    private lateinit var adapter: FlagshipAdapter
    lateinit var viewmodel: FlagshipViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlagshipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel = ViewModelProvider(this)[FlagshipViewmodel::class.java]
        viewmodel.fetchFlagshipEvents()

        viewmodel.flagshipList.observe(this){
            binding.progressCircular.visibility = View.GONE
            adapter.submitList(it.toMutableList())
        }

        adapter = FlagshipAdapter(this).also { it.setCallback(this) }
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this@FlagshipActivity)
    }

    override fun onClick(item: FlagshipModel) {
        val intent = Intent(this@FlagshipActivity, FlagshipDetailsActivity::class.java)
        intent.putExtra("model", item)
        startActivity(intent)
    }
}