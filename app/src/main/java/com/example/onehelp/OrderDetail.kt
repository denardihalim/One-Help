package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner

class OrderDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_detail)

        val spinner1: Spinner = findViewById(R.id.od_spinner1)
        ArrayAdapter.createFromResource(
                this,
                R.array.date,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner1.adapter = adapter
        }

        val spinner2: Spinner = findViewById(R.id.od_spinner2)
        ArrayAdapter.createFromResource(
                this,
                R.array.hour,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        val spinner3: Spinner = findViewById(R.id.od_spinner3)
        ArrayAdapter.createFromResource(
                this,
                R.array.minute,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter
        }

        var od_imageButton1_toHomePage = findViewById<ImageButton>(R.id.od_imageButton1)
        od_imageButton1_toHomePage.setOnClickListener{
            var intentHome= Intent(this,HomePage::class.java)
            startActivity(intentHome)
        }

        var od_button1_toOrderList = findViewById<Button>(R.id.od_button1)
        od_button1_toOrderList.setOnClickListener{
            var intentHome= Intent(this,OrderList::class.java)
            startActivity(intentHome)
        }
    }
}