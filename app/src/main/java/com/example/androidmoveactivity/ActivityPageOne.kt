package com.example.androidmoveactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityPageOne : AppCompatActivity() {

    lateinit var nameEditText: EditText
    lateinit var goActivityHelloBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_one)

        nameEditText = findViewById(R.id.name_edit_text)
        goActivityHelloBtn =  findViewById(R.id.go_activity_hello_btn)

        goActivityHelloBtn.setOnClickListener{
            val moveToActivityHello = Intent(applicationContext, ActivityHello::class.java)
            val nameCall = nameEditText.text.toString()
            moveToActivityHello.putExtra("name_call", nameCall)

            startActivity(moveToActivityHello)
        }
    }
}