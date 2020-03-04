package com.teamandroids.triviagame.application


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button
import android.widget.TextView

class RecordsPage : AppCompatActivity() {

    private var thisScore = "0"
    private var baseScore = "0"
    private var highestScore ="0"
    private var correctCount = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores_page)

        if(intent.hasExtra("thisScore")){
            thisScore = intent.getStringExtra("thisScore")
        }

        if(intent.hasExtra("baseScore")){
            baseScore = intent.getStringExtra("baseScore")
        }

        if(intent.hasExtra("highestScore")){
            highestScore = intent.getStringExtra("highestScore")
        }
        if(intent.hasExtra("correctCount")){
            correctCount = intent.getStringExtra("correctCount")
        }

        val totalScoreText: TextView = findViewById<TextView>(R.id.totalScore)
        totalScoreText.text = (baseScore.toInt()+thisScore.toInt()).toString()

        val lastScoreText: TextView = findViewById(R.id.lastScore)
        lastScoreText.text = thisScore

        /* button back to homePage */
        val backHome : Button =  findViewById<Button>(R.id.buttonHome)
        backHome.setOnClickListener {
            val i =  Intent(this, MainActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }

        /* button to new Game */
        val resumeGame: Button = findViewById<Button>(R.id.buttonGame)
        resumeGame.setOnClickListener {
            val i =  Intent(this, LevelActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }


        //        /* button navigate to AchievementsPage */
//        val achievements : Button = findViewById<Button>(R.id.buttonAch)
//        achievements.setOnClickListener {
//            val i =  Intent(this, Achievements::class.java)
//            i.putExtra("baseScore", baseScore)
//            i.putExtra("thisScore", thisScore)
//            i.putExtra("HighestScore", highestScore)
//            startActivity(i)
//        }


    }

}