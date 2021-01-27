package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        var su_imageButton1_toFirstPage = findViewById<ImageButton>(R.id.su_imageButton1)
        su_imageButton1_toFirstPage.setOnClickListener{
            var intentHome= Intent(this,FirstPage::class.java)
            startActivity(intentHome)
        }

        var su_button1_toHomePage = findViewById<Button>(R.id.su_button1)
        su_button1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }

        var su_textView6_toLogin = findViewById<TextView>(R.id.su_textView6)
        su_textView6_toLogin.setOnClickListener{
            var intentHome= Intent(this,Login::class.java)
            startActivity(intentHome)
        }
    }
}