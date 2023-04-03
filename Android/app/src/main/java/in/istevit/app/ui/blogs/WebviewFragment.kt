package `in`.istevit.app.ui.blogs

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import `in`.istevit.app.databinding.FragmentWebviewBinding

class WebviewFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentWebviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWebviewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = arguments?.getString("link").toString()

        binding.apply {
            webViewBottomSheet.loadUrl(url)
            bottomSheetWebviewClose.setOnClickListener { dismiss() }
            bottomSheetWebviewReload.setOnClickListener { webViewBottomSheet.reload() }
            webViewBottomSheet.webViewClient = object : WebViewClient() {
                @Deprecated("Deprecated in Java")
                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    view.loadUrl(url)
                    return false
                }
            }

            bottomSheetWebviewUrlTv.setOnClickListener {
                val clipboard: ClipboardManager =
                    activity?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                val clip: ClipData = ClipData.newPlainText("url", url)
                clipboard.setPrimaryClip(clip)
                Toast.makeText(requireContext(), "URL copied to clipboard", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}