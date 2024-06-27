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

class ActivityQuestionFive : AppCompatActivity() {

    private var result = 0

    private lateinit var questionFiveTB: Toolbar
    private lateinit var answersFiveRG: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

    }

    private fun init(){
        setContentView(R.layout.activity_question_five)
        questionFiveTB = findViewById(R.id.questionFiveTB)
        setSupportActionBar(questionFiveTB)
        title = "Вопрос №5:"

        answersFiveRG = findViewById(R.id.answersFiveRG)
    }

    fun radioButtonClick(view: View) {
        result = intent.getIntExtra("result", 0)
        val radio: RadioButton = findViewById(answersFiveRG.checkedRadioButtonId)
        if (radio.id == R.id.replyTwoRB) result += 100
        val intent = Intent(this, ActivityResult::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
        finish()
    }
}