package com.example.jacobgraves.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.jacobgraves.myapplication.Database.Question
import com.example.jacobgraves.myapplication.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    var type = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        var ans1 = findViewById<Button>(R.id.answer1)
        var ans2 = findViewById<Button>(R.id.answer2)
        var ans3 = findViewById<Button>(R.id.answer3)
        var ans4 = findViewById<Button>(R.id.answer4)

        var builder = QuestionBuilder()
        var list  = builder.build()

        QuestionView.setText(list.get(1).Question)
        ans1.setText(list.get(1).Answer1a)
        ans2.setText(list.get(1).Answer2b)
        ans3.setText(list.get(1).Answer3c)
        ans4.setText(list.get(1).Answer4d)

    }
}

