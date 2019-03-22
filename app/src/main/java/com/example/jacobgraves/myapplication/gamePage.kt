package com.example.jacobgraves.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.jacobgraves.myapplication.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*
import org.w3c.dom.Text

class gamePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page)

        var ans1 = findViewById<Button>(R.id.button)
        var ans2 = findViewById<Button>(R.id.button5)
        var ans3 = findViewById<Button>(R.id.button6)
        var ans4 = findViewById<Button>(R.id.button7)
        var builder = QuestionBuilder()



        QuestionView.setText(builder.returnRandom().Question)




    }
}

