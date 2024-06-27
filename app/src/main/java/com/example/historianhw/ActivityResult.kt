package com.example.historianhw

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityResult : AppCompatActivity() {

    private var result = 0
    private lateinit var titleResultTV: TextView
    private lateinit var briefDescriptionTV: TextView
    private lateinit var finishBTN: Button

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        result()
    }

    @SuppressLint("SetTextI18n")
    fun result(){
        result = intent.getIntExtra("result", 0)
        titleResultTV.text = "Ваш результат составил: ${result} очков"
        briefDescriptionTV.text = when(result){
            in 0..100 -> BrefDescriptionData().resultOne
            200 -> BrefDescriptionData().resultTwo
            300 -> BrefDescriptionData().resultThree
            400 -> BrefDescriptionData().resultFour
            500 -> BrefDescriptionData().resultFive
            else -> ""
        }
    }

    private fun init(){
        setContentView(R.layout.activity_result)
        finishBTN = findViewById(R.id.finishBTN)
        titleResultTV = findViewById(R.id.titleResultTV)
        briefDescriptionTV = findViewById(R.id.briefDescriptionTV)
    }

    fun onClick(view: View) {
        finish()
    }
}