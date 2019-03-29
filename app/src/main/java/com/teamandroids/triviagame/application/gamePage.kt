package com.teamandroids.triviagame.application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.teamandroids.triviagame.application.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)
        var builder = QuestionBuilder().getQuestion("Science", 3)

        builder?.wasUsed=true
        QuestionView.setText(builder?.Question)
        Answer1a.setText(builder?.Answer1a)
        Answer2b.setText(builder?.Answer2b)
        Answer3c.setText(builder?.Answer3c)
        Answer4d.setText(builder?.Answer4d)

    }
}

