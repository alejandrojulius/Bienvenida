package com.example.bienvenida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bienvenida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //evento click del boton pe
        binding.btnSaludar.setOnClickListener {
                    //leer el valor de la entrada de texto
          binding.txtNombre.editText?.text.toString()

            binding.lblMensaje.text = resources.getString(R.string.bienvenido)
            val edad = binding.txtEdad.editText?.text.toString().toIntOrNull()
              if (nombre.isEmpty()){
                  binding.txtNombre.error = resources.getString(R.string.campo_requerido)
                  return@setOnClickListener
              }
            if (edad!= null){
                binding.lblMensaje.text = resources.getString(R.string.bienvenido, nombre, edad)
            }
        }

    }
}