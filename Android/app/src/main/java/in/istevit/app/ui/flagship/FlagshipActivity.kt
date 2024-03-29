package `in`.istevit.app.ui.flagship

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.adapters.FlagshipAdapter
import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.databinding.ActivityFlagshipBinding
import `in`.istevit.app.util.Result

@AndroidEntryPoint
class FlagshipActivity : AppCompatActivity(), FlagshipOnClickCallback{
    lateinit var binding: ActivityFlagshipBinding
    private lateinit var adapter: FlagshipAdapter

    private val viewModel by lazy {
        ViewModelProvider(this)[FlagshipViewmodel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlagshipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FlagshipAdapter(this).also { it.setCallback(this) }
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.flagshipList.observe(this){
            when (it) {
                is Result.Loading -> {
                    binding.progressCircular.visibility = View.VISIBLE
                    binding.errorLayout.visibility = View.GONE
                }
                is Result.Success -> {
                    adapter.submitList(it.data)
                    binding.progressCircular.visibility = View.GONE
                }

                else -> {
                    binding.progressCircular.visibility = View.GONE
                    binding.errorLayout.visibility = View.VISIBLE
                }
            }
        }

        binding.retryBTN.setOnClickListener {
            viewModel.fetchFlagshipEvents()
        }
    }

    override fun onClick(item: FlagshipModel) {
        val intent = Intent(this, FlagshipDetailsActivity::class.java)
        intent.putExtra("model", item)
        startActivity(intent)
    }
}