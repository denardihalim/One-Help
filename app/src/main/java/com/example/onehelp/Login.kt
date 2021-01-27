package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        var login_imageButton1_toFirstPage = findViewById<ImageButton>(R.id.login_imageButton1)
        login_imageButton1_toFirstPage.setOnClickListener{
            var intentHome= Intent(this,FirstPage::class.java)
            startActivity(intentHome)
        }

        var login_button1_toHomePage = findViewById<Button>(R.id.login_button1)
        login_button1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }

        var login_button2_toCWF  = findViewById<Button>(R.id.login_button2)
        login_button2_toCWF.setOnClickListener{
            var intentHome= Intent(this,ContinueWithFacebook::class.java)
            startActivity(intentHome)
        }

        var login_button3_toCWG  = findViewById<Button>(R.id.login_button3)
        login_button3_toCWG.setOnClickListener{
            var intentHome= Intent(this,ContinueWithGoogle::class.java)
            startActivity(intentHome)
        }
    }
}