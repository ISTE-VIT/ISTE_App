package `in`.istevit.app.ui.blogs

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import `in`.istevit.app.R
import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.databinding.ActivityBlogDetailsBinding

class BlogDetailsActivity : AppCompatActivity(), ReadCallback {
    private lateinit var binding: ActivityBlogDetailsBinding
    private lateinit var bottomSheetDialog: BottomSheetDialog
    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)

            binding.blog = intent.getSerializableExtra("blogItem") as BlogDetailsModel?
            binding.callback = this@BlogDetailsActivity
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onRead(link: String) {
        bottomSheetDialog.setContentView(view)
        bottomSheetDialog.show()
    }
}
@BindingAdapter("loadImage")
fun loadImage(view: ImageView, url: String) {
    Glide.with(view)
        .load(url)
        .placeholder(R.drawable.placeholder_image)
        .centerCrop()
        .into(view)
}

@BindingAdapter("setCallback", "blogData")
fun setCallback(view: Button, callback: ReadCallback, blog: BlogDetailsModel) {
    view.setOnClickListener {
        val bottomSheetDialogFragment = WebviewFragment()
        val mBundle = Bundle()
        mBundle.putString("link",blog.link)
        bottomSheetDialogFragment.arguments = mBundle
        bottomSheetDialogFragment.show((view.context as FragmentActivity).supportFragmentManager, bottomSheetDialogFragment.tag)
    }
}