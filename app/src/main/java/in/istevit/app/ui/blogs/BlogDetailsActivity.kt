package `in`.istevit.app.ui.blogs

import `in`.istevit.app.R
import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.databinding.ActivityBlogDetailsBinding
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog

class BlogDetailsActivity : AppCompatActivity(), ReadCallback {
    lateinit var binding: ActivityBlogDetailsBinding
    lateinit var bottomSheetDialog: BottomSheetDialog
    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            binding.blog = BlogDetailsModel(
                image = intent.getStringExtra("blogImage")!!,
                title = intent.getStringExtra("blogTitle")!!,
                writer = intent.getStringExtra("blogAuthor")!!,
                description = intent.getStringExtra("blogDescription")!!,
                link = intent.getStringExtra("blogLink")!!,
                date = intent.getStringExtra("blogDate")!!
            )
            binding.callback = this@BlogDetailsActivity
        }

        bottomSheetDialog = BottomSheetDialog(this)
        view = layoutInflater.inflate(R.layout.bottom_sheet_webview, null)
        view.findViewById<WebView>(R.id.webView_bottom_sheet).loadUrl(intent.getStringExtra("blogLink")!!)
        view.findViewById<ImageView>(R.id.bottom_sheet_webview_close).setOnClickListener { bottomSheetDialog.dismiss() }
        view.findViewById<ImageView>(R.id.bottom_sheet_webview_reload).setOnClickListener { view.findViewById<WebView>(R.id.webView_bottom_sheet).reload() }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onRead(link: String) {
        bottomSheetDialog.setContentView(view)
        bottomSheetDialog.show()
    }

    companion object{
        @BindingAdapter("loadImage")
        @JvmStatic
        fun loadImage(view: ImageView, url: String) {
            Glide.with(view).load(url).centerCrop().into(view)
        }

        @BindingAdapter("setCallback", "blogData")
        @JvmStatic
        fun setCallback(view: Button, callback: ReadCallback, blog: BlogDetailsModel){
            view.setOnClickListener { callback.onRead(blog.link) }
        }
    }
}