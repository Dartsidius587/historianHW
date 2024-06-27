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

class ActivityQuestionFour : AppCompatActivity() {

    private var result = 0

    private lateinit var questionFourTB: Toolbar
    private lateinit var answersFourRG: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init(){
        setContentView(R.layout.activity_question_four)
        questionFourTB = findViewById(R.id.questionFourTB)
        setSupportActionBar(questionFourTB)
        title = "Вопрос №4:"

        answersFourRG = findViewById(R.id.answersFourRG)
    }

    fun radioButtonClick(view: View) {
        result = intent.getIntExtra("result", 0)
        val radio: RadioButton = findViewById(answersFourRG.checkedRadioButtonId)
        if (radio.id == R.id.replyThreeRB) result += 100
        val intent = Intent(this, ActivityQuestionFive::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
        finish()
    }
}