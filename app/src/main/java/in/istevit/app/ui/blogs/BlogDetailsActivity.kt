package `in`.istevit.app.ui.blogs

import `in`.istevit.app.databinding.ActivityBlogDetailsBinding
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class BlogDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityBlogDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.apply {
            toolbarLayout.title = intent.getStringExtra("blogTitle")
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            blogAuthor.text = "Written by:- ${intent.getStringExtra("blogAuthor")}"
            blogDescription.text = intent.getStringExtra("blogDescription")
            val image = intent.getStringExtra("blogImage")
            Glide.with(imageView).load(image).centerCrop().into(imageView)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}