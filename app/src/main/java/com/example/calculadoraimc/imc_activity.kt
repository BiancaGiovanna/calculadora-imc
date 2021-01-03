package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class imc_activity : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnmale : Button
    private lateinit var btnfemale : Button

    private lateinit var btncalc : Button
    private lateinit var editPeso : EditText
    private lateinit var editAltura : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        editPeso = findViewById(R.id.peso)
        editAltura = findViewById(R.id.altura)

        btncalc = findViewById(R.id.button_calc)
        btncalc.setOnClickListener(this)


        btnmale = findViewById(R.id.male)
        btnfemale = findViewById(R.id.female)

        btnmale.setOnClickListener(this)
        btnfemale.setOnClickListener(this)


    }

    fun openResult(view: View) {
        val openActivityResult = Intent(this, activity_result::class.java)

        startActivity(openActivityResult)

    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.male ->{
                btnmale.background = getDrawable(R.drawable.select_button_male)
                btnfemale.background= getDrawable(R.drawable.border_button_female)

            }
            R.id.female ->{
               btnfemale.background= getDrawable(R.drawable.select_button_female)
                btnmale.background= getDrawable(R.drawable.border_button_male)
            }
        }
        when (v.id) {
            R.id.button_calc ->{
                val imc = calcularImc(editPeso.text.toString().toDouble(),
                    editAltura.text.toString().toDouble())
            }
        }
        when (v.id){
            R.id.button_calc ->{
                val abrirActivityResult = Intent(this, activity_result::class.java)
                abrirActivityResult.putExtra("peso", editPeso.text.toString().toDouble())
                abrirActivityResult.putExtra("altura", editAltura.text.toString().toDouble())
                startActivity(abrirActivityResult)

            }
        }
    }

}

