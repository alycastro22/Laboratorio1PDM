package hn.edu.ujcv.pdm_2021_i_p1_laboratorio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEntrar.setOnClickListener {entrar()}
    }
    fun entrar(){
        if(txtNombre.text.toString().isEmpty()) {
            Toast.makeText(this, "Debe ingresar un nombre", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, InicioAppActivity::class.java)
            intent.putExtra("nombre", txtNombre.text.toString())
            startActivity(intent)
        }
    }
}