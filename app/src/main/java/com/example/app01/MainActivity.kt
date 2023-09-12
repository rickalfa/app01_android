package com.example.app01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Obtén una referencia a la vista TextView.
        val textView = findViewById<TextView>(R.id.textViewlogin)

        val btn: Button = findViewById<Button>(R.id.btn_login)


        btn.setOnClickListener{


          val intent = Intent(this, Home_Activity::class.java)

            startActivity(intent)


        }






    }
}