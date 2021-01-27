package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_page)

        var fp_button1_toLogin = findViewById<Button>(R.id.fp_button1)
        fp_button1_toLogin.setOnClickListener{
            var intentHome= Intent(this,Login::class.java)
            startActivity(intentHome)
        }

        var fp_button2_toSignUp = findViewById<Button>(R.id.fp_button2)
        fp_button2_toSignUp.setOnClickListener{
            var intentHome= Intent(this,SignUp::class.java)
            startActivity(intentHome)
        }
    }
}