package com.example.qta2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class IniciarSesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion)

        // Acción de volver 
        val toolbar = findViewById<Toolbar>(R.id.toolbar_sign_in)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        // boton de inicio de infgresar
        val emailEditText: EditText = findViewById(R.id.user_text) // Campo de correo

        val entryButton: Button = findViewById(R.id.entryButton)

        entryButton.setOnClickListener {
            // Obtener el correo ingresado
            val email = emailEditText.text.toString()

            // Crear el Intent para iniciar DosMitadesActivity
            val intent = Intent(this, DosMitadesActivity::class.java)
            intent.putExtra("EMAIL", email) // Pasar el correo al Intent
            startActivity(intent) // Iniciar DosMitadesActivity
        }

    }
}