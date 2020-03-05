package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_magalu.*

class ActivityMagalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        idWVMagalu.webViewClient = WebViewClient()
        idWVMagalu.settings.javaScriptEnabled = true;
        idWVMagalu.settings.displayZoomControls = true;

        idWVMagalu.loadUrl("https://www.magazineluiza.com.br/")
    }
}
