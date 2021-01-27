package com.example.onehelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PaymentCConfirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._payment_c_confirmation)

        var pcc_button1_toRating = findViewById<Button>(R.id.pcc_button1)
        pcc_button1_toRating.setOnClickListener{
            var intentHome= Intent(this,Rating::class.java)
            startActivity(intentHome)
        }
    }
}