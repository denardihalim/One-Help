package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class OrderPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_page)

        var op_imageButton1_toHomePage = findViewById<ImageButton>(R.id.op_imageButton1)
        op_imageButton1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,PaymentMethod::class.java)
            startActivity(intentHome)
        }
    }
}