package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recarga_claro.*
import kotlinx.android.synthetic.main.activity_retirar_dinero.*

class RetirarDineroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retirar_dinero)
        txtEnviar1.setOnClickListener() {
            Retirar()

        }
    }

    fun menuPrincipal(view: View) {
        val regresarMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(regresarMenu)
    }

    fun Retirar(){
        if(txtCuenta1.text.isEmpty()){
            Toast.makeText(this, "Debe ingresar Cuenta", Toast.LENGTH_SHORT).show()
        }
        else if (txtMonto2.text.isEmpty()){
            Toast.makeText(this, "Ingrese Cantidad", Toast.LENGTH_SHORT).show()
        }
        else if (txtMonto2.text.toString().toDouble() >0 && txtMonto2.text.toString().toDouble() <5001){
            val cuenta= txtCuenta1.text
            val monto = txtMonto2.text
            val builder =  AlertDialog.Builder(this)
            builder.setTitle("Confirmación Retiro")
            builder.setMessage("¿Desea Retirar Lps: " + monto + " De la cuenta: " + cuenta + "?")
            builder.setPositiveButton("Confirmar", { dialogInterface: DialogInterface, i: Int ->
                val intent = Intent(this, RetirarDineroExitosoActivity::class.java)
                intent.putExtra("cuenta", txtCuenta1.text.toString())
                intent.putExtra("monto", txtMonto2.text.toString())
                startActivity(intent)
                limpiarcampo()
            })
            builder.setNegativeButton("Cancelar", { dialogInterface: DialogInterface, i: Int -> })
            builder.show()
        }
        else{
            Toast.makeText(this, "Ingrese Cantidad entre 1 y 5000", Toast.LENGTH_SHORT).show()
        }
    }
    fun limpiarcampo(){
        txtCuenta1.text.clear()
        txtMonto2.text.clear()
    }
}