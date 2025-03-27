package com.example.calculo_imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontra o botão na tela inicial
        val btnIniciar = findViewById<Button>(R.id.btnIniciar)

        // Configura o clique do botão para iniciar a segunda tela
        btnIniciar.setOnClickListener {
            // Cria uma nova intenção para abrir a próxima Activity (SegundaTela)
            val intent = Intent(this, SegundaTela::class.java)
            startActivity(intent) // Inicia a nova Activity
        }
    }
}