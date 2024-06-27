package com.example.historianhw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var startBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        startBTN.setOnClickListener {
            val intent = Intent(this,ActivityQuestionOne::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun init(){
        setContentView(R.layout.activity_main)
        startBTN = findViewById(R.id.startBTN)
    }
}