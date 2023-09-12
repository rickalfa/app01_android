package com.example.app01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button


class Home_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val btnBack: Button = findViewById<Button>(R.id.button_back)

        btnBack.setOnClickListener{


            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }


    }
}