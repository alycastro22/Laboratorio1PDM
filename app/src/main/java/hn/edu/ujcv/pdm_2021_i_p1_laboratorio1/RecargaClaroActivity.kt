package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recarga_claro.*

class RecargaClaroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recarga_claro)
        btnComprar1.setOnClickListener() {
            Comprar()

        }

    }

    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(volverMenu)

    }
    fun Comprar() {

        if (txtNumero1.text.isEmpty()) {
            Toast.makeText(this, "Debe Ingresar un número", Toast.LENGTH_SHORT).show()
        }
        else if (txtMonto1.text.isEmpty()) {
            Toast.makeText(this, "Debe Ingresar un monto 10, 25, 50, 100", Toast.LENGTH_SHORT).show()

        }
        else if (txtTipoC.text.toString().isEmpty()) {
            Toast.makeText(this, "Elegir 'Recarga' o 'SuperRecarga'", Toast.LENGTH_SHORT).show()
        }

        else if (txtTipoC.text.toString() == "Recarga" && txtNumero1.text.isNotEmpty() && txtMonto1.text.isNotEmpty() && txtMonto1.text.toString().toDouble()>9) {
            val numero = txtNumero1.text
            val monto = txtMonto1.text

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmación Recarga")
            builder.setMessage("¿Desea enviar recarga de Lps: " + monto + "Al número: " + numero + "?")
            builder.setPositiveButton("Confirmar", { dialogInterface: DialogInterface, i: Int ->
                val intent = Intent(this, RecargoClaroExitosoActivity::class.java)
                intent.putExtra("tipo", txtTipoC.text.toString())
                intent.putExtra("numero", txtNumero1.text.toString())
                intent.putExtra("monto", txtMonto1.text.toString())
                startActivity(intent)
                limpiarCampos()
            })
            builder.setNegativeButton("Cancelar", { dialogInterface: DialogInterface, i: Int -> })
            builder.show()
        } else if (txtTipoC.text.toString() == "SuperRecarga" && txtNumero1.text.isNotEmpty() && txtMonto1.text.isNotEmpty() && txtMonto1.text.toString().toDouble()>9 ) {
            val numero = txtNumero1.text
            val monto = txtMonto1.text

            val builder =  AlertDialog.Builder(this)
            builder.setTitle("Confirmación Recarga")
            builder.setMessage("¿Desea enviar SuperRecarga de Lps: " + monto + "Al número: " + numero + "?")
            builder.setPositiveButton("Confirmar", { dialogInterface: DialogInterface, i: Int ->
                val intent = Intent(this, RecargoClaroExitosoActivity::class.java)
                intent.putExtra("tipo", txtTipoC.text.toString())
                intent.putExtra("numero", txtNumero1.text.toString())
                intent.putExtra("monto", txtMonto1.text.toString())
                startActivity(intent)
                limpiarCampos()
            })
            builder.setNegativeButton("Cancelar", { dialogInterface: DialogInterface, i: Int -> })
            builder.show()

        }else{
            Toast.makeText(this, "Debe ingresar Recarga o SuperRecarga", Toast.LENGTH_SHORT).show()

        }


    }
    fun limpiarCampos(){
        txtTipoC.text.clear()
        txtNumero1.text.clear()
        txtMonto1.text.clear()
    }
}