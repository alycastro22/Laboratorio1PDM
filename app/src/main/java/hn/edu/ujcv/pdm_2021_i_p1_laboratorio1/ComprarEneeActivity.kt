package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_comprar_enee.*
import kotlinx.android.synthetic.main.activity_transferir.*

class  ComprarEneeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprar_enee)
        txtEnviar.setOnClickListener { realizarpago() }
    }

    fun menuPrincipal(view: View) {
        val regresarMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(regresarMenu)
    }
    fun pago(){
        if (txtCodigoEN.text.isEmpty()){
            Toast.makeText(this, "Debe ingresar el código del recibo", Toast.LENGTH_LONG).show()
        }
        if(txtClienteSa.text.isEmpty()){
            Toast.makeText(this, "Debe ingresar el nombre", Toast.LENGTH_SHORT).show()
        }
        if(txtDireccionSA.text.isEmpty()){
            Toast.makeText(this,"Debe ingresar su dirección", Toast.LENGTH_LONG).show()
        }
        if (txtFecha.text.isEmpty()){
            Toast.makeText(this,"Debe ingresar la fecha", Toast.LENGTH_LONG).show()
        }
        if(txtTotalSA.text.isEmpty()){
            Toast.makeText(this,"Debe ingresar el total a pagar", Toast.LENGTH_LONG).show()
        }
    }
    fun realizarpago(){
        if (txtCodigoEN.text.isNotEmpty() && txtClienteSa.text.isNotEmpty() && txtDireccionSA.text.isNotEmpty() && txtFecha.text.isNotEmpty() && txtTotalSA.text.isNotEmpty()){
            val intent = Intent(this, CompraEneeExitosaActivity::class.java)
            intent.putExtra("codigo", txtCodigoEN.text.toString())
            intent.putExtra("cliente", txtClienteSa.text.toString())
            intent.putExtra("direccion", txtDireccionSA.text.toString())
            intent.putExtra("fecha", txtFecha.text.toString())
            intent.putExtra("total", txtTotalSA.text.toString())
            startActivity(intent)
            limpiarCampos()
        }else{
            pago()
        }
    }
    fun limpiarCampos(){
        txtCodigoEN.text.clear()
        txtClienteSa.text.clear()
        txtDireccionSA.text.clear()
        txtFecha.text.clear()
        txtTotalSA.text.clear()
    }
}