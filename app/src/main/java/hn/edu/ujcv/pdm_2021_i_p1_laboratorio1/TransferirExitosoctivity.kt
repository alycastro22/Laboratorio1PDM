package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_transferir_exitosoctivity.*

class TransferirExitosoctivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferir_exitosoctivity)
        getNombre()
    }

    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(volverMenu)
    }
    fun getNombre(){
        val bundle = intent.extras
        val nombre = bundle?.get("nombre origen")
        val cuenta = bundle?.get("cuenta origen")
        val monto = bundle?.get("monto")
        val nombreD = bundle?.get("nombre destino")
        val cuentadestino = bundle?.get("cuenta destino")
        val identidad = bundle?.get("identidad")
        txttranferirExitosoV.text = getString(R.string.transferirET, nombre,cuenta,monto,nombreD,identidad, cuentadestino)
    }
}