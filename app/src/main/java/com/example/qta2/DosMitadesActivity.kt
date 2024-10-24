package com.example.qta2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DosMitadesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosmitades)

        // Obtener el correo del Intent
        val email = intent.getStringExtra("EMAIL") ?: "Correo no ingresado"

        // Referenciar el TextView donde se mostrará el correo
        val emailPreview: TextView = findViewById(R.id.tvGreeting)

        // Establecer el texto del correo
        emailPreview.text = "Hola $email"

        val inputString: EditText = findViewById(R.id.etInputString)
        val solveButton: Button = findViewById(R.id.btnSolve)

        solveButton.setOnClickListener {
            val cadena = inputString.text.toString()
            val resultado = intercambiarMitades(cadena)
            inputString.setText(resultado) // Muestra la cadena resultante
        }
    }

    // Lógica para intercambiar las mitades de la cadena
    private fun intercambiarMitades(cadena: String): String {
        val longitud = cadena.length
        val mitad = longitud / 2

        return if (longitud % 2 == 0) {
            val primeraMitad = cadena.substring(0, mitad)
            val segundaMitad = cadena.substring(mitad)
            "$segundaMitad$primeraMitad"
        } else {
            val primeraMitad = cadena.substring(0, mitad + 1)
            val segundaMitad = cadena.substring(mitad + 1)
            "$segundaMitad$primeraMitad"
        }
    }
}
