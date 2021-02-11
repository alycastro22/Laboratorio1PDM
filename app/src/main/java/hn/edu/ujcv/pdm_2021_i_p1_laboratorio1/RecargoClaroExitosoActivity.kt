package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_recarga_claro.*
import kotlinx.android.synthetic.main.activity_recargo_claro_exitoso.*
import kotlinx.android.synthetic.main.activity_transferir_exitosoctivity.*

class RecargoClaroExitosoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recargo_claro_exitoso)
        getRecarga()
    }

    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, RecargaClaroActivity::class.java)
        startActivity(volverMenu)
    }
    fun getRecarga(){
        val bundle = intent.extras
        val tipo = bundle?.get("tipo")
        val numero = bundle?.get("numero")
        val monto = bundle?.get("monto")
        txtRecarga.text = getString(R.string.Recarga, tipo, numero, monto)
    }
}