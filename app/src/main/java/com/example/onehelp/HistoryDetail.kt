package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HistoryDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history_detail)

        var hd_imageButton1_toHistory = findViewById<ImageButton>(R.id.hd_imageButton1)
        hd_imageButton1_toHistory.setOnClickListener{
            var intentHome= Intent(this,History::class.java)
            startActivity(intentHome)
        }
    }
}