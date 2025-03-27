package com.example.calculoimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Tela inicial do aplicativo
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout da tela

        val btnIniciar = findViewById<Button>(R.id.btnIniciar) // Botão para iniciar o cálculo do IMC

        btnIniciar.setOnClickListener {
            // Criando uma intenção para abrir a tela de cálculo do IMC
            val intent = Intent(this, CalculoIMCActivity::class.java)
            startActivity(intent) // Inicia a nova atividade
        }
    }
}