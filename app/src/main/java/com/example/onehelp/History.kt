package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history)

        var history_imageButton1_toHomePage = findViewById<ImageButton>(R.id.history_imageButton1)
        history_imageButton1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }

        var history_button1_toHistoryDetail = findViewById<Button>(R.id.history_Button1)
        history_button1_toHistoryDetail.setOnClickListener{
            var intentHome= Intent(this,HistoryDetail::class.java)
            startActivity(intentHome)
        }
    }
}