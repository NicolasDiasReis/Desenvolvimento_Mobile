package com.example.calculo_imc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        // Encontrando as views
        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        // Calculando o IMC quando o botão for clicado
        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString().toFloatOrNull() // Obtém o peso
            val altura = edtAltura.text.toString().toFloatOrNull() // Obtém a altura

            if (peso != null && altura != null && altura > 0) {
                val imc = peso / (altura * altura) // Cálculo do IMC
                val categoria = when {
                    imc < 18.5 -> "Abaixo do peso"
                    imc in 18.5..24.9 -> "Peso normal"
                    imc in 25.0..29.9 -> "Sobrepeso"
                    imc in 30.0..34.9 -> "Obesidade Grau 1"
                    imc in 35.0..39.9 -> "Obesidade Grau 2"
                    imc >= 40 -> "Obesidade Grau 3 (Mórbida)"
                    else -> "Erro ao calcular"
                }

                txtResultado.text = "IMC: %.2f\n%s".format(imc, categoria) // Exibe o resultado
            } else {
                txtResultado.text = "Digite valores válidos!" // Exibe erro se valores forem inválidos
            }
        }
    }
}