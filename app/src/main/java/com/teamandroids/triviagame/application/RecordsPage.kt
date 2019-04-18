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

    private var score = "0"
    private var test3 = "pass3...Ok"
   // private var test2 = "pass2...ok"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores_page)

        /* using intent */
        if(intent.hasExtra("MainToRecords")){
            score = intent.getStringExtra("MainToRecords")

        }


        var totalScoreText: TextView = findViewById<TextView>(R.id.totalScore)
        totalScoreText.text = score

        var lastScoreText: TextView = findViewById(R.id.lastScore)
        lastScoreText.text = score


        /* button navigate to AchievementsPage */
        val achievements : Button = findViewById<Button>(R.id.buttonAch)
        achievements.setOnClickListener {
            var i =  Intent(this, Achievements::class.java)
            startActivity(i)
        }


        /* button back to homePage */
        val backHome : Button =  findViewById<Button>(R.id.buttonHome)
        backHome.setOnClickListener {

            var i =  Intent(this, MainActivity::class.java)

           // i.putExtra(current, current)

            startActivity(i)
        }

        /* button to new Game */
        val resumeGame: Button = findViewById<Button>(R.id.buttonGame)
        resumeGame.setOnClickListener {
            var i =  Intent(this, LevelActivity::class.java)
            startActivity(i)
        }


    }

}