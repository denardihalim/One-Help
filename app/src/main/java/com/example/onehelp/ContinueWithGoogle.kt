package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ContinueWithGoogle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.continue_with_google)

        var cwg_imageButton1_toLogin = findViewById<ImageButton>(R.id.cwg_imageButton1)
        cwg_imageButton1_toLogin.setOnClickListener{
            var intentHome= Intent(this,Login::class.java)
            startActivity(intentHome)
        }

        var cwg_button1_toHomePage = findViewById<Button>(R.id.cwg_button1)
        cwg_button1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }

        var cwg_button2_toCWF = findViewById<Button>(R.id.cwg_button2)
        cwg_button2_toCWF.setOnClickListener{
            var intentHome= Intent(this,ContinueWithFacebook::class.java)
            startActivity(intentHome)
        }
    }
}