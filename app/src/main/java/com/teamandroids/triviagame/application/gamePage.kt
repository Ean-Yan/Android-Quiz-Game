package com.teamandroids.triviagame.application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.teamandroids.triviagame.application.Database.Question
import com.teamandroids.triviagame.application.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    var type = ""
    var choice = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        var ans1 = findViewById<Button>(R.id.Answer1a)
        var ans2 = findViewById<Button>(R.id.Answer2b)
        var ans3 = findViewById<Button>(R.id.Answer3c)
        var ans4 = findViewById<Button>(R.id.Answer4d)
        var scoreT=findViewById<TextView>(R.id.Score)

        var score=0

        var builder = QuestionBuilder()
        var list  = builder.build()

        QuestionView.setText(list.get(1).Question)
        ans1.setText(list.get(1).Answer1a)
        ans2.setText(list.get(1).Answer2b)
        ans3.setText(list.get(1).Answer3c)
        ans4.setText(list.get(1).Answer4d)

        val Answer1a : Button = findViewById<Button>(R.id.Answer1a)
        Answer1a.setOnClickListener {
            choice=1
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            scoreT.setText(score.toString())
        }
        val Answer2b : Button = findViewById<Button>(R.id.Answer2b)
        Answer2b.setOnClickListener {
            choice=2
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            scoreT.setText(score.toString())
        }
        val Answer3c : Button = findViewById<Button>(R.id.Answer3c)
        Answer3c.setOnClickListener {
            choice=3
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            scoreT.setText(score.toString())
        }
        val Answer4d : Button = findViewById<Button>(R.id.Answer4d)
        Answer4d.setOnClickListener {
            choice=4
            if (choice==list.get(1).correct){//correct answer code goes here
                score+=(100*list.get(1).QDiff)
            }
            else{}
            scoreT.setText(score.toString())
        }

    }
}
