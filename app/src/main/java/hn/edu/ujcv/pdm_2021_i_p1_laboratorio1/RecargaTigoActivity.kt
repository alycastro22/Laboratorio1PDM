package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recarga_claro.*
import kotlinx.android.synthetic.main.activity_recarga_tigo.*

class RecargaTigoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recarga_tigo)
        btnComprar.setOnClickListener() {
            Comprar()
        }

    }

    fun menuPrincipal(view: View) {
        val volverMenu = Intent(this, InicioAppActivity::class.java)
        startActivity(volverMenu)

    }

    fun Comprar() {

        if (Txtnumero.text.isEmpty()) {
            Toast.makeText(this, "Debe Ingresar un número", Toast.LENGTH_SHORT).show()
        }
        else if (txtmonto.text.isEmpty()) {
            Toast.makeText(this, "Debe Ingresar un monto 10, 25, 50, 100", Toast.LENGTH_SHORT).show()

        }
        else if (txtTipo.text.toString().isEmpty()) {
            Toast.makeText(this, "Elegir 'Recarga' o 'SuperRecarga'", Toast.LENGTH_SHORT).show()
        }

        if (txtTipo.text.toString() == "Recarga" && Txtnumero.text.isNotEmpty() && txtmonto.text.isNotEmpty()  && txtmonto.text.toString().toDouble()>9) {
            val numero = Txtnumero.text
            val monto = txtmonto.text

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmación Recarga")
            builder.setMessage("¿Desea enviar recarga de Lps: " + monto + "Al número: " + numero + "?")
            builder.setPositiveButton("Confirmar", { dialogInterface: DialogInterface, i: Int ->
                val intent = Intent(this, RecargaTigoExitosaActivity::class.java)
                intent.putExtra("tipo", txtTipo.text.toString())
                intent.putExtra("numero", Txtnumero.text.toString())
                intent.putExtra("monto", txtmonto.text.toString())
                startActivity(intent)
                limpiarCampos()

            })
            builder.setNegativeButton("Cancelar", { dialogInterface: DialogInterface, i: Int -> })
            builder.show()
        } else if (txtTipo.text.toString() == "SuperRecarga" && Txtnumero.text.isNotEmpty() && txtmonto.text.isNotEmpty() && txtmonto.text.toString().toDouble()>9 ) {
            val numero = Txtnumero.text
            val monto = txtmonto.text

            val builder =  AlertDialog.Builder(this)
            builder.setTitle("Confirmación Recarga")
            builder.setMessage("¿Desea enviar SuperRecarga de Lps: " + monto + "Al número: " + numero + "?")
            builder.setPositiveButton("Confirmar", { dialogInterface: DialogInterface, i: Int ->
                val intent = Intent(this, RecargaTigoExitosaActivity::class.java)
                intent.putExtra("tipo", txtTipo.text.toString())
                intent.putExtra("numero", Txtnumero.text.toString())
                intent.putExtra("monto", txtmonto.text.toString())
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
        txtTipo.text.clear()
        Txtnumero.text.clear()
        txtmonto.text.clear()
    }


}