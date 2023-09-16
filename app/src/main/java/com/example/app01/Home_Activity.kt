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
        val btnvista03: Button = findViewById<Button>(R.id.button_load_vista3)
        val btnvista02: Button = findViewById<Button>(R.id.button_load_vista02)


        btnBack.setOnClickListener{


            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

        btnvista03.setOnClickListener{

            val intent = Intent(this, vista3_Activity::class.java)

            startActivity(intent)

        }

        btnvista02.setOnClickListener{

            val intent = Intent(this, vista2_activity::class.java)

            startActivity(intent)

        }






    }
}