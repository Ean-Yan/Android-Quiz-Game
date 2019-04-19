package com.teamandroids.triviagame.application

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_achievement_page.view.*

class Achievements : AppCompatActivity() {

    private var thisScore = "0"
    private var baseScore = "0"
    private var highestScore = "0"
    private var correctCount = "0"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievement_page)


        if(intent.hasExtra("thisScore")){
            thisScore= intent.getStringExtra("thisScore")
        }
        if(intent.hasExtra("baseScore")){
            baseScore = intent.getStringExtra("baseScore")
        }
        if(intent.hasExtra("HighestScore")){
            highestScore = intent.getStringExtra("HighestScore")
        }
        if(intent.hasExtra("correctCount")){
            correctCount = intent.getStringExtra("correctCount")
        }

        val scoreHighestText: TextView = findViewById<TextView>(R.id.scoreHighest)
        scoreHighestText.text = highestScore

        val correctCountText: TextView = findViewById(R.id.correctTotal)
        correctCountText.text = correctCount

        // button back to homePage
        val backHome : Button =  findViewById<Button>(R.id.buttonHome)
        backHome.setOnClickListener {
            val i =  Intent(this, MainActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }

        // button to new Game
        val resumeGame: Button = findViewById<Button>(R.id.buttonGame)
        resumeGame.setOnClickListener {
            val i =  Intent(this, LevelActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }



    }

}