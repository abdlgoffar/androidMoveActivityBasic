package com.example.androidmoveactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ActivityHello : AppCompatActivity() {

    lateinit var nameTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        nameTextView = findViewById(R.id.name_text_view)

        val nameCall = intent.getStringExtra("name_call")

        nameTextView.setText(nameCall)
    }
}