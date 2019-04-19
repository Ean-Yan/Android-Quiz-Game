package com.teamandroids.triviagame.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button

class LevelActivity : Activity() {

    var type = "QuestionType"
    private var baseScore="0"
    private var thisScore="0"
    private var highestScore= "0"
    private var correctCount = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        if(intent.hasExtra("baseScore")){
            baseScore = intent.getStringExtra("baseScore")
        }
        if(intent.hasExtra("thisScore")){
            thisScore = intent.getStringExtra("thisScore")
        }
        if(intent.hasExtra("HighestScore")){
            highestScore = intent.getStringExtra("HighestScore")
        }
        if(intent.hasExtra("correctCount")){
            correctCount = intent.getStringExtra("correctCount")
        }


        val dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)

        val width = dm.widthPixels
        val height = dm.heightPixels

        window.setLayout((width*0.8).toInt(),(height*0.4).toInt())

        val params = window.attributes
        params.gravity = Gravity.CENTER
        params.x = 0
        params.y = -20

        val science : Button = findViewById<Button>(R.id.ScienceButton)
            science.setOnClickListener {
                val i = Intent (this, gamePage::class.java)
                i.putExtra(type, "Science")
                i.putExtra("baseScore", baseScore)
                i.putExtra("thisScore", thisScore)
                i.putExtra("HighestScore", highestScore)
                i.putExtra("correctCount", correctCount)
                startActivity(i)
            }

        val politics : Button = findViewById<Button>(R.id.PoliticsButton)
            politics.setOnClickListener {

                val i = Intent (this, gamePage::class.java)
                i.putExtra(type, "Politics")
                i.putExtra("baseScore", baseScore)
                i.putExtra("thisScore", thisScore)
                i.putExtra("HighestScore", highestScore)
                i.putExtra("correctCount", correctCount)
                startActivity(i)
            }
        val sports : Button = findViewById<Button>(R.id.SportsButton)
            sports.setOnClickListener {
                val i = Intent (this, gamePage::class.java)
                i.putExtra(type, "Sports")
                i.putExtra("baseScore", baseScore)
                i.putExtra("thisScore", thisScore)
                i.putExtra("HighestScore", highestScore)
                i.putExtra("correctCount", correctCount)
                startActivity(i)
            }
        val history : Button = findViewById<Button>(R.id.RetryButton)
            history.setOnClickListener {
                val i = Intent (this, gamePage::class.java)
                i.putExtra(type, "History")
                i.putExtra("baseScore", baseScore)
                i.putExtra("thisScore", thisScore)
                i.putExtra("HighestScore", highestScore)
                i.putExtra("correctCount", correctCount)
                startActivity(i)
            }
        window.attributes=params
    }
}
