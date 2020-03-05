package br.com.fiap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_americanas.*
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mercado_livre.*
import kotlinx.android.synthetic.main.activity_netshoes.*
import kotlinx.android.synthetic.main.activity_sobre.*
import kotlinx.android.synthetic.main.activity_sobre.idbotaoSobre
import kotlinx.android.synthetic.main.activity_submarino.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            idbotaoSobre.setOnClickListener {
                var intent = Intent(this, ActivitySobre::class.java)
                startActivity(intent) //BOTÃO SOBRE
            }
            idBuscape.setOnClickListener {
                var intent = Intent(this, ActivityBuscape::class.java)
                startActivity(intent) //BUSCAPE
            }
            idMercadoLivre.setOnClickListener {
                var intent = Intent(this, ActivityMercadoLivre::class.java)
                startActivity(intent) //MERCADO LIVRE
            }
            idNetshoes.setOnClickListener {
                var intent = Intent(this, ActivityNetshoes::class.java)
                startActivity(intent) //NETSHOES
            }
            idAmericanas.setOnClickListener {
                var intent = Intent(this, ActivityAmericanas::class.java)
                startActivity(intent) //AMERICANAS
            }
            idSubmarino.setOnClickListener {
                var intent = Intent(this, ActivitySubmarino::class.java)
                startActivity(intent)  //SUBMARINO
            }
            idMagalu.setOnClickListener {
                var intent = Intent(this, ActivityMagalu::class.java)
                startActivity(intent) //MAGALU
            }
            idEbay.setOnClickListener {
                var intent = Intent(this, ActivityEbay::class.java)
                startActivity(intent) //EBAY
            }

            idWebMotors.setOnClickListener {
                var intent = Intent(this, ActivityWebMotors::class.java)
                startActivity(intent)
            }

        }

    }

