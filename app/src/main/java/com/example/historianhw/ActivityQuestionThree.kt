package com.example.historianhw

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityQuestionThree : AppCompatActivity() {

    private var result = 0

    private lateinit var questionThreeTB: Toolbar
    private lateinit var answersThreeRG: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

    }

    private fun init(){
        setContentView(R.layout.activity_question_three)
        questionThreeTB = findViewById(R.id.questionThreeTB)
        setSupportActionBar(questionThreeTB)
        title = "Вопрос №3:"

        answersThreeRG = findViewById(R.id.answersThreeRG)
    }

    fun radioButtonClick(view: View) {
        result = intent.getIntExtra("result", 0)
        val radio: RadioButton = findViewById(answersThreeRG.checkedRadioButtonId)
        if (radio.id == R.id.replyThreeRB) result += 100
        val intent = Intent(this, ActivityQuestionFour::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
        finish()
    }
}