package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*

class ActivityBuscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)


        idWVBuscape.webViewClient = WebViewClient()

        idWVBuscape.settings.javaScriptEnabled = true;

        idWVBuscape.settings.displayZoomControls = true;


        idWVBuscape.loadUrl("https://www.buscape.com.br/")
    }
}
