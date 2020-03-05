package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ebay.*

class ActivityEbay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)


        idWVEbay.webViewClient = WebViewClient()
        idWVEbay.settings.javaScriptEnabled = true;
        idWVEbay.settings.displayZoomControls = true;

        idWVEbay.loadUrl("https://www.ebay.com/")
    }
}