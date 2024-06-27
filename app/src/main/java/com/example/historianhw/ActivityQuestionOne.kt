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

class ActivityQuestionOne : AppCompatActivity() {

    private var result = 0

    private lateinit var questionOneTB: Toolbar
    private lateinit var answersOneRG: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init(){
        setContentView(R.layout.activity_question_one)
        questionOneTB = findViewById(R.id.questionOneTB)
        setSupportActionBar(questionOneTB)
        title = "Вопрос №1:"

        answersOneRG = findViewById(R.id.answersOneRG)
    }

    fun radioButtonClick(view: View) {
        val radio: RadioButton = findViewById(answersOneRG.checkedRadioButtonId)
        if (radio.id == R.id.replyTwoRB) result = 100
        val intent = Intent(this, ActivityQuestionTwo::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
        finish()
    }
}
