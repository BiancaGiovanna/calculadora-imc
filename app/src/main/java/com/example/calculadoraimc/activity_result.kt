package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_activity)

        val peso = intent.getDoubleExtra("peso", 0.0)
        val altura =intent.getDoubleExtra("altura", 0.0)
        val text_view_resultado = findViewById<TextView>(R.id.resultado)
        val text_view_status = findViewById<TextView>(R.id.status)

        val resultado = calcularImc(peso, altura)

        text_view_resultado.text = resultado[0]
        text_view_status.text = resultado[1]
    }
}