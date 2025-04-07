package com.example.calculo_imc

import android.content.Intent
import android.os.Bundle
import android.view.ViewOutlineProvider
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        val avatar = findViewById<ImageView>(R.id.imgAvatar)

        // Força o corte arredondado
        avatar.outlineProvider = ViewOutlineProvider.BACKGROUND
        avatar.clipToOutline = true

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString().toFloatOrNull()
            val altura = edtAltura.text.toString().toFloatOrNull()

            if (peso != null && altura != null && altura > 0) {
                val imc = peso / (altura * altura)
                val categoria = when {
                    imc < 18.5 -> "Abaixo do peso"
                    imc in 18.5..24.9 -> "Peso normal"
                    imc in 25.0..29.9 -> "Sobrepeso"
                    imc in 30.0..34.9 -> "Obesidade Grau 1"
                    imc in 35.0..39.9 -> "Obesidade Grau 2"
                    imc >= 40 -> "Obesidade Grau 3 (Mórbida)"
                    else -> "Erro ao calcular"
                }
                txtResultado.text = "IMC: %.2f\n%s".format(imc, categoria)
            } else {
                txtResultado.text = "Digite valores válidos!"
            }
        }

        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
