package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ContinueWithFacebook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.continue_with_facebook)

        var cwf_imageButton1_toLogin = findViewById<ImageButton>(R.id.cwf_imageButton1)
        cwf_imageButton1_toLogin.setOnClickListener{
            var intentHome= Intent(this,Login::class.java)
            startActivity(intentHome)
        }

        var cwf_button1_toHomePage = findViewById<Button>(R.id.cwf_button1)
        cwf_button1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }

        var cwf_button2_toCWG = findViewById<Button>(R.id.cwf_button2)
        cwf_button2_toCWG.setOnClickListener{
            var intentHome= Intent(this,ContinueWithGoogle::class.java)
            startActivity(intentHome)
        }
    }
}