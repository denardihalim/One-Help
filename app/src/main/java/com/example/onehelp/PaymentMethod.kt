package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PaymentMethod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_method)

        var pm_button1_toCC = findViewById<Button>(R.id.pm_button1)
        pm_button1_toCC.setOnClickListener{
            var intentHome= Intent(this,PaymentCConfirmation::class.java)
            startActivity(intentHome)
        }
    }
}