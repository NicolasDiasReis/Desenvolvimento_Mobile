package com.example.calculo_imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        btnIniciar.setOnClickListener {
            val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent)
        }
    }
}
