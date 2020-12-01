package com.example.calculadoraimc

import com.example.calculadoraimc.repository.Frases
import java.text.DecimalFormat
import java.util.*

fun calcularImc(peso: Double, altura: Double) : Array<String>{

    val imc = peso / (altura * altura)
    val status = obterStatus(imc)
    return arrayOf(formatarDouble(imc), obterStatus(imc), status, obterFrases(status))
}

fun obterFrases(status: String): String {
    var tamanho= 0

    if (status == "Peso Ideal") {
        tamanho = Frases.frasesIdeal.size
        return Frases.frasesIdeal[Random().nextInt(tamanho)]
    } else {
        tamanho = Frases.frasesNaoIdeal.size
        return Frases.frasesNaoIdeal[Random().nextInt(tamanho)]
    }
}

fun formatarDouble(valor:Double) : String{
    val df = DecimalFormat("##,###.0")
    return df.format(valor)
}
fun obterStatus (imc: Double): String{
    if (imc < 18.5){
        return "Abaixo do peso"

    } else if (imc >= 18.6 && imc < 25.0) {
        return "Peso ideal"
    } else if (imc >= 25.0 && imc < 30.0) {
        return  "Levemente acima do Peso"
    } else if (imc >= 30.0 && imc < 35){
        return  "Obesidade grau I"
    } else if (imc >= 35 && imc < 40){
        return  "Obesidade grau II"
    } else {
        return "Obesidade grau III"
    }
}