package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rating)

        var rating_button1_toHomePage = findViewById<Button>(R.id.rating_button1)
        rating_button1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }
    }
}