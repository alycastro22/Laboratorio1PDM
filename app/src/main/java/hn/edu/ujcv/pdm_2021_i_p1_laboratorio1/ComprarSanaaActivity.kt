package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ComprarSanaaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprar_sanaa)
    }

    fun menuPrincipal(view: View) {
        val regresarMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(regresarMenu)
    }
}