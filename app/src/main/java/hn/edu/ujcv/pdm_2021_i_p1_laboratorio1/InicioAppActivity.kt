package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio_app.*
import kotlinx.android.synthetic.main.activity_main.*

class InicioAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_app)
        getNombre()
    }
    fun getNombre(){
        val bundle = intent.extras
        val nombre = bundle?.get("nombre")
        txtvSaludar.text = getString(R.string.bienvenido, nombre)
    }
    private fun bootones(){
        btnENEE.setOnClickListener{compraE()}
        
    }
    private fun compraE(){
        val intent = Intent(this, ComprarEneeActivity::class.java)
        startActivity(intent)
    }
    private fun compraS(){}


}