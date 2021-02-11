package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_recarga_tigo_exitosa.*

class RecargaTigoExitosaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recarga_tigo_exitosa)
        recargatigo()
    }

    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, RecargaTigoActivity::class.java)
        startActivity(volverMenu)
    }

    fun recargatigo(){
        val bundle = intent.extras
        val tipo = bundle?.get("tipo")
        val numero = bundle?.get("numero")
        val monto = bundle?.get("monto")
        txtRecarga.text = getString(R.string.Recarga, tipo, numero, monto)
    }

}