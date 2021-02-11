package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_recarga_tigo_exitosa.*
import kotlinx.android.synthetic.main.activity_retirar_dinero_exitoso.*

class RetirarDineroExitosoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retirar_dinero_exitoso)
        retiro()

    }
    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, RecargaTigoActivity::class.java)
        startActivity(volverMenu)
    }

    fun retiro(){
        val bundle = intent.extras
        val cuenta = bundle?.get("cuenta")
        val monto = bundle?.get("monto")
        txtRetiro.text = getString(R.string.Retiro, monto, cuenta)
    }

}