package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_transferir.*

class TransferirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transferir)
        btnTransferir.setOnClickListener { realizarTranferencia() }
    }
    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(volverMenu)
    }
    fun tranferirDinero(){
        if (txtCuenta.text.isEmpty()){
            Toast.makeText(this, "Debe ingresar una cuenta la persona de origen", Toast.LENGTH_LONG).show()
        }
        if(txtTipo.text.isEmpty()){
            Toast.makeText(this, "Debe ingresar un nombre de la persona de origen", Toast.LENGTH_SHORT).show()
        }
        if(txtMonto.text.isEmpty()){
            Toast.makeText(this,"Debe ingresar una cantidad de dinero",Toast.LENGTH_LONG).show()
        }
        if (txtNombreDestino.text.isEmpty()){
            Toast.makeText(this,"Debe ingresar el nombre de la persona de destino",Toast.LENGTH_LONG).show()
        }
        if(txtCuenta_destino.text.isEmpty()){
            Toast.makeText(this,"Debe ingresar una cuenta de la persona destino", Toast.LENGTH_LONG).show()
        }
        if(txtIdentidad.text.isEmpty()){
            Toast.makeText(this, "Debe ingresar la identidad de la persona de destino", Toast.LENGTH_LONG).show()
        }
    }

    fun realizarTranferencia(){
        if (txtCuenta.text.isNotEmpty() && txtTipo.text.isNotEmpty() && txtMonto.text.isNotEmpty() && txtNombreDestino.text.isNotEmpty() && txtCuenta_destino.text.isNotEmpty() && txtIdentidad.text.isNotEmpty()){
            val intent = Intent(this, TransferirExitosoctivity::class.java)
            intent.putExtra("nombre origen", txtTipo.text.toString())
            intent.putExtra("cuenta origen", txtCuenta.text.toString())
            intent.putExtra("monto", txtMonto.text.toString())
            intent.putExtra("nombre destino", txtNombreDestino.text.toString())
            intent.putExtra("cuenta destino", txtCuenta_destino.text.toString())
            intent.putExtra("identidad", txtIdentidad.text.toString())
            startActivity(intent)
            limpiarCampos()
        }else{
            tranferirDinero()
        }
    }
    fun limpiarCampos(){
        txtCuenta.text.clear()
        txtNombre.text.clear()
        txtCuenta_destino.text.clear()
        txtMonto.text.clear()
        txtNombreDestino.text.clear()
        txtIdentidad.text.clear()
    }


}


