package com.teamandroids.triviagame.application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.teamandroids.triviagame.application.Database.Question
import com.teamandroids.triviagame.application.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    var qtype = "History"
    private var builder = QuestionBuilder()
    var choice = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)
		
		if(intent.hasExtra("QuestionType")){
             qtype = intent.getStringExtra("QuestionType")
        }

        var ans1 = findViewById<Button>(R.id.Answer1a)
        var ans2 = findViewById<Button>(R.id.Answer2b)
        var ans3 = findViewById<Button>(R.id.Answer3c)
        var ans4 = findViewById<Button>(R.id.Answer4d)
        var scoreT=findViewById<TextView>(R.id.Score)

        var score=0
        var list  = builder.getQuestionList(qtype)

        var question = list.first()
        QuestionView.text=question.Question
        ans1.text = question.Answer1a
        ans2.text = question.Answer2b
        ans3.text = question.Answer3c
        ans4.text = question.Answer4d
        question.wasUsed=false

        val Answer1a : Button = findViewById<Button>(R.id.Answer1a)
        Answer1a.setOnClickListener {
            choice=1
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            list.drop(1)
            scoreT.setText(score.toString())
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false

        }
        val Answer2b : Button = findViewById<Button>(R.id.Answer2b)
        Answer2b.setOnClickListener {
            choice=2
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            list.drop(1)
            scoreT.setText(score.toString())
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false
        }
        val Answer3c : Button = findViewById<Button>(R.id.Answer3c)
        Answer3c.setOnClickListener {
            choice=3
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            list.drop(1)
            scoreT.setText(score.toString())
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false
        }
        val Answer4d : Button = findViewById<Button>(R.id.Answer4d)
        Answer4d.setOnClickListener {
            choice=4
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            list.drop(1)
            scoreT.setText(score.toString())
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false
        }

    }
}
