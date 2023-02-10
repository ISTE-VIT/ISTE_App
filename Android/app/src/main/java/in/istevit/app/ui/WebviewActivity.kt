package `in`.istevit.app.ui

import `in`.istevit.app.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import dagger.hilt.android.AndroidEntryPoint

class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webview = findViewById<WebView>(R.id.webview)
        webview.loadUrl(intent.getStringExtra("url").toString())
    }
}