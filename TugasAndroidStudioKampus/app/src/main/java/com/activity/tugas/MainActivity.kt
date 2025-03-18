package com.activity.tugas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextInput = findViewById<EditText>(R.id.editTextInput)
        val buttonSend = findViewById<Button>(R.id.buttonSend)

        buttonSend.setOnClickListener {
            val inputText = editTextInput.text.toString()
            val intent = Intent(this, Screen2Activity::class.java)
            intent.putExtra("INPUT_TEXT", inputText)
            startActivity(intent)
        }
    }
}