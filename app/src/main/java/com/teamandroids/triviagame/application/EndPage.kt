package com.teamandroids.triviagame.application

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button
import android.widget.TextView

class EndPage : AppCompatActivity() {

    private var baseScore = "0"
    private var thisScore = "0"
    private var highestScore = "0"
    private var correctCount = "0"

    /* var previous = "type" */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_page)

        //PopWindow Settings
        var dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)
        val params = window.attributes
        params.gravity = Gravity.CENTER
        params.x = 0
        params.y = -20

        //receive score via "pass"
        if(intent.hasExtra("pass")){
            thisScore = intent.getStringExtra("pass")
        }
        //receive baseScore via "baseScore"
        if(intent.hasExtra("baseScore")){
            baseScore = intent.getStringExtra("baseScore")
        }
        //receive highest Score
        if(intent.hasExtra("HighestScore")){
            highestScore = intent.getStringExtra("HighestScore")
        }
        // receive correct Counts
        if(intent.hasExtra("correctCount")){
            correctCount = intent.getStringExtra("correctCount")
        }

        //Show this score
        var score: TextView = findViewById<TextView>(R.id.endScore)
        score.text = thisScore


        //Return Button
        var returnM: Button = findViewById<Button>(R.id.MenuButton)
        returnM.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)  // Main Page holds baseScore and thisScore
        }

        //Retry Button
        var retryB: Button = findViewById(R.id.RetryButton)
        retryB.setOnClickListener {
            var i = Intent(this, LevelActivity::class.java)

            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)  // Level Activity holds baseScore and thisScore
        }
        window.attributes=params
    }
}
