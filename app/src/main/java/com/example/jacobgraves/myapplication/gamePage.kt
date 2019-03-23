package com.example.jacobgraves.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.jacobgraves.myapplication.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        var ans1 = findViewById<Button>(R.id.answer1)
        var ans2 = findViewById<Button>(R.id.answer2)
        var ans3 = findViewById<Button>(R.id.answer3)
        var ans4 = findViewById<Button>(R.id.answer4)

        var builder = QuestionBuilder()
        QuestionView.setText(builder.returnRandom().Question)
        ans1.setText(builder.returnRandom().Answer1a)
        ans2.setText(builder.returnRandom().Answer2b)
        ans3.setText(builder.returnRandom().Answer3c)
        ans4.setText(builder.returnRandom().Answer4d)

    }
}

