package com.example.jacobgraves.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.jacobgraves.myapplication.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    var qtype = "History"
    private var builder = QuestionBuilder()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        if(intent.hasExtra("QuestionType")){
             qtype = intent.getStringExtra("QuestionType")
        }

        var ans1 = findViewById<Button>(R.id.answer1)
        var ans2 = findViewById<Button>(R.id.answer2)
        var ans3 = findViewById<Button>(R.id.answer3)
        var ans4 = findViewById<Button>(R.id.answer4)

        var list  = builder.getQuestionList(qtype)

        var question = list.first()
        QuestionView.text=question.Question
        ans1.text = question.Answer1a
        ans2.text = question.Answer2b
        ans3.text = question.Answer3c
        ans4.text = question.Answer4d
        question.wasUsed=false
        list.drop(1)
    }
}

