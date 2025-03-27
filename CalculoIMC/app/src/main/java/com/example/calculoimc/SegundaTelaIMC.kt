// Segunda atividade para calcular o IMC
package com.example.calculoimc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculoIMCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela_imc) // Define o layout da tela

        // Referências aos elementos da interface
        val edtPeso = findViewById<EditText>(R.id.edtPeso) // Campo para inserir peso
        val edtAltura = findViewById<EditText>(R.id.edtAltura) // Campo para inserir altura
        val btnCalcular = findViewById<Button>(R.id.btnCalcular) // Botão de calcular
        val txtResultado = findViewById<TextView>(R.id.txtResultado) // Texto para exibir o resultado

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text.toString().toFloatOrNull() // Obtém o peso do usuário
            val altura = edtAltura.text.toString().toFloatOrNull() // Obtém a altura do usuário

            if (peso != null && altura != null && altura > 0) {
                val imc = peso / (altura * altura) // Fórmula do IMC

                // Determina a categoria do IMC com base no valor calculado
                val categoria = when {
                    imc < 18.5 -> "Abaixo do peso"
                    imc in 18.5..24.9 -> "Peso normal"
                    imc in 25.0..29.9 -> "Sobrepeso"
                    imc in 30.0..34.9 -> "Obesidade Grau 1"
                    imc in 35.0..39.9 -> "Obesidade Grau 2"
                    imc >= 40 -> "Obesidade Grau 3 (Mórbida)"
                    else -> "Erro ao calcular"
                }

                // Exibe o resultado formatado no TextView
                txtResultado.text = "IMC: %.2f\n%s".format(imc, categoria)
            } else {
                txtResultado.text = "Digite valores válidos!" // Mensagem de erro se os dados forem inválidos
            }
        }
    }
}