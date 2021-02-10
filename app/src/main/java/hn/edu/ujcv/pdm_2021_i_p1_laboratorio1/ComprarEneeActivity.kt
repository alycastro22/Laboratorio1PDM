package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class  ComprarEneeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprar_enee)
    }

    fun menuPrincipal(view: View) {
        val regresarMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(regresarMenu)
    }
}