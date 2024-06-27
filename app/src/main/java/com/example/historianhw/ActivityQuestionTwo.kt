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

class ActivityQuestionTwo : AppCompatActivity() {

    private var result = 0

    private lateinit var questionTwoTB: Toolbar
    private lateinit var answersTwoRG: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init(){
        setContentView(R.layout.activity_question_two)
        questionTwoTB = findViewById(R.id.questionTwoTB)
        setSupportActionBar(questionTwoTB)
        title = "Вопрос №2:"
        answersTwoRG = findViewById(R.id.answersTwoRG)
    }

    fun radioButtonClick(view: View) {
        result = intent.getIntExtra("result", 0)
        val radio: RadioButton = findViewById(answersTwoRG.checkedRadioButtonId)
        if (radio.id == R.id.replyOneRB) result += 100
        val intent = Intent(this, ActivityQuestionThree::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
        finish()
    }
}