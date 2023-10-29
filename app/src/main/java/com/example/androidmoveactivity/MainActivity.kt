package com.example.androidmoveactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var goActivityPageOne: Button
    lateinit var goActivityPageTwo: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goActivityPageOne = findViewById(R.id.go_activity_page_one_btn)
        goActivityPageTwo = findViewById(R.id.go_activity_page_two_btn)


        goActivityPageOne.setOnClickListener{
            val moveToActivityPageOne =  Intent(applicationContext, ActivityPageOne::class.java)
            startActivity(moveToActivityPageOne)
        }

        goActivityPageTwo.setOnClickListener{
            val moveToActivityPageTwo =  Intent(applicationContext, ActivityPageTwo::class.java)
            startActivity(moveToActivityPageTwo)
        }
    }
}