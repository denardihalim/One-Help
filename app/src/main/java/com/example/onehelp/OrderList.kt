package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class OrderList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_list)

        var ol_imageButton1_toOrderDetail = findViewById<ImageButton>(R.id.ol_imageButton1)
        ol_imageButton1_toOrderDetail.setOnClickListener{
            var intentHome= Intent(this,OrderDetail::class.java)
            startActivity(intentHome)
        }

        var ol_button1_toOrderPage = findViewById<Button>(R.id.ol_button1)
        ol_button1_toOrderPage.setOnClickListener{
            var intentHome= Intent(this,OrderPage::class.java)
            startActivity(intentHome)
        }
    }
}