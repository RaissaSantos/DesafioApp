package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_netshoes.*

class ActivityNetshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)


        idWVNetshoes.webViewClient = WebViewClient()
        idWVNetshoes.settings.javaScriptEnabled = true;
        idWVNetshoes.settings.displayZoomControls = true;

        idWVNetshoes.loadUrl("https://www.netshoes.com.br/")
    }
}
