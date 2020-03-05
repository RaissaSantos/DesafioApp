package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_americanas.*

class ActivityAmericanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        idWVAmericanas.webViewClient = WebViewClient()
        idWVAmericanas.settings.javaScriptEnabled = true;
        idWVAmericanas.settings.displayZoomControls = true;


        idWVAmericanas.loadUrl("https://www.americanas.com.br/")
    }
}
