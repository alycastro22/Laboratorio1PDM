package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InicioAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_app)
    }

    fun abrirEnee(view: View) {
        val cambio = Intent(this, ComprarEneeActivity::class.java)
        startActivity(cambio)
    }

    fun abrirSanaa(view: View) {
        val cambio = Intent(this, ComprarSanaaActivity::class.java)
        startActivity(cambio)
    }

    fun abrirTigo(view: View) {
        val cambio = Intent(this, RecargaTigoActivity::class.java)
        startActivity(cambio)
    }

    fun abrirClaro(view: View) {
        val cambio = Intent(this, RecargaClaroActivity::class.java)
        startActivity(cambio)
    }

    fun abrirRetirar(view: View) {
        val cambio = Intent(this, RetirarDineroActivity::class.java)
        startActivity(cambio)
    }

    fun abrirTransferir(view: View) {
        val cambio = Intent(this, TransferirActivity::class.java)
        startActivity(cambio)
    }

}