package com.example.app01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vista3_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista3)


        val btnback: Button = findViewById<Button>(R.id.button_back02)

        btnback.setOnClickListener{

            val intent = Intent(this, Home_Activity::class.java)

            startActivity(intent)


        }





    }
}