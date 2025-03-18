package com.activity.tugas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val textViewReceived = findViewById<TextView>(R.id.textViewReceived)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        val receivedText = intent.getStringExtra("INPUT_TEXT") ?: "No text received"
        textViewReceived.text = receivedText

        buttonBack.setOnClickListener {
            finish()
        }
    }
}