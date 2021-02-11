package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_compra_enee_exitosa.*

class CompraSAExitosaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compra_s_a_exitosa)
        getNombre()
    }

    fun menuPrincipal(view: View) {
        val regresarMenu = Intent(this, ComprarSanaaActivity::class.java)
        startActivity(regresarMenu)
    }
    fun getNombre(){
        val bundle = intent.extras
        val codigo = bundle?.get("codigo")
        val nombre = bundle?.get("cliente")
        val direccion = bundle?.get("direccion")
        val fecha = bundle?.get("fecha")
        val total = bundle?.get("total")
        txtcompraenne.text = getString(R.string.pagoExitoso, nombre, codigo,direccion, total, fecha)
    }

}