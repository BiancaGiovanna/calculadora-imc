package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*
class activity_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, main_menu_activity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}