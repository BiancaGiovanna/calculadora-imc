package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class main_menu_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_activity)

    }
    fun openImc(view: View){
        val openImcActivity = Intent(this, imc_activity::class.java)
        startActivity(openImcActivity)
    }
}