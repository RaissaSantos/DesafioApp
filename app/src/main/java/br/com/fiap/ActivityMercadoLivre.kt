package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_mercado_livre.*

class ActivityMercadoLivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado_livre)

        idWVMercadoLivre.webViewClient = WebViewClient()
        idWVMercadoLivre.settings.javaScriptEnabled = true;
        idWVMercadoLivre.settings.displayZoomControls = true;

        idWVMercadoLivre.loadUrl("https://www.mercadolivre.com.br/")
    }
}
