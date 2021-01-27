package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        var hp_imageButton1_toOrderDetail = findViewById<ImageButton>(R.id.hp_imageButton1)
        hp_imageButton1_toOrderDetail.setOnClickListener{
            var intentHome= Intent(this,OrderDetail::class.java)
            startActivity(intentHome)
        }

        var hp_imageButton2_toOrderDetail = findViewById<ImageButton>(R.id.hp_imageButton2)
        hp_imageButton2_toOrderDetail.setOnClickListener{
            var intentHome= Intent(this,OrderDetail::class.java)
            startActivity(intentHome)
        }

        var hp_imageButton3_toOrderDetail = findViewById<ImageButton>(R.id.hp_imageButton3)
        hp_imageButton3_toOrderDetail.setOnClickListener{
            var intentHome= Intent(this,OrderDetail::class.java)
            startActivity(intentHome)
        }

        var hp_imageButton4_toOrderDetail = findViewById<ImageButton>(R.id.hp_imageButton4)
        hp_imageButton4_toOrderDetail.setOnClickListener{
            var intentHome= Intent(this,OrderDetail::class.java)
            startActivity(intentHome)
        }

        var hp_imageButton7_toHistory = findViewById<ImageButton>(R.id.hp_imageButton7)
        hp_imageButton7_toHistory.setOnClickListener{
            var intentHome= Intent(this,History::class.java)
            startActivity(intentHome)
        }
    }
}