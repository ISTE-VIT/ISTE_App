package `in`.istevit.app.ui

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import `in`.istevit.app.R
import java.net.URL


class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webview = findViewById<WebView>(R.id.webview)
        val closeBTN = findViewById<ImageView>(R.id.closeBTN)
        val reloadBTN = findViewById<ImageView>(R.id.reloadBTN)
        val urlTV = findViewById<TextView>(R.id.websiteTV)

        val url = intent.getStringExtra("url").toString()
        webview.loadUrl(url)
        val baseUrl = URL(url).host
        urlTV.text = baseUrl.toString()

        webview.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return false
            }
        }

        closeBTN.setOnClickListener {
            this.finish()
        }

        reloadBTN.setOnClickListener {
            webview.reload()
        }

        urlTV.setOnClickListener {
            val clipboard: ClipboardManager =
                getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip: ClipData = ClipData.newPlainText("url", url)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(this, "URL copied to clipboard", Toast.LENGTH_SHORT).show()
        }
    }
}