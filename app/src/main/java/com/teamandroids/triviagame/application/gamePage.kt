package com.teamandroids.triviagame.application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.teamandroids.triviagame.application.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)
        var builder = QuestionBuilder().getQuestion("Science", 3)
        /*var Question = findViewById<TextView>(R.id.QuestionView)
        var Answer1a = findViewById<TextView>(R.id.Answer1a)
        var Answer2b = findViewById<TextView>(R.id.Answer2b)
        var Answer3c = findViewById<TextView>(R.id.Answer3c)
        var Answer4d = findViewById<TextView>(R.id.Answer4d)

        builder?.wasUsed = true
        Question.setText(builder?.Question)
        Answer1a.setText(builder?.Answer1a)
        Answer2b.setText(builder?.Answer2b)
        Answer3c.setText(builder?.Answer3c)
        Answer4d.setText(builder?.Answer4d)*/
    }
}

