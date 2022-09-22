package `in`.istevit.app.ui.flagship

import `in`.istevit.app.adapters.FlagshipAdapter
import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.databinding.ActivityFlagshipBinding
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class FlagshipActivity : AppCompatActivity(), FlagshipOnClickCallback{
    lateinit var binding: ActivityFlagshipBinding
    private lateinit var adapter: FlagshipAdapter
    private var flagshipList = mutableListOf<FlagshipModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlagshipBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FlagshipAdapter(this).also { it.setCallback(this) }
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this@FlagshipActivity)
        flagshipList.add(FlagshipModel("Technica", "https://istevit.in/imgs/event-imgs/Technica_thumb-min.png", "Technica is a 48-hour hackathon held in Horizon by ISTE-VIT with the goal of inspiring participants to push their limits in the quest for excellence with around 900 participants and an array of creative ideas for a more technologically promising future. It is a multi-domain hackathon with the goal of providing innovative technical solutions to real-world problems in areas such as Healthcare, Education, Fin-Tech, and Open Innovation. Technica encourages participants to seek out innovative solutions and showcase their talent while promoting healthy living competition between peers.", mutableListOf("https://d112y698adiu2z.cloudfront.net/photos/production/challenge_thumbnails/001/913/296/datas/large.png", "https://d112y698adiu2z.cloudfront.net/photos/production/challenge_thumbnails/001/913/296/datas/large.png", "https://d112y698adiu2z.cloudfront.net/photos/production/challenge_thumbnails/001/913/296/datas/large.png", "https://d112y698adiu2z.cloudfront.net/photos/production/challenge_thumbnails/001/913/296/datas/large.png")))
        adapter.submitList(flagshipList)
    }

    override fun onClick(item: FlagshipModel) {
        val intent = Intent(this@FlagshipActivity, FlagshipDetailsActivity::class.java)
        intent.putExtra("model", item)
        startActivity(intent)
    }
}