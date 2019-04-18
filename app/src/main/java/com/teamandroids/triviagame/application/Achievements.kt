package com.teamandroids.triviagame.application

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class Achievements : AppCompatActivity() {

    private var score = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievement_page)


        if(intent.hasExtra("MainToAchievements")){
            score = intent.getStringExtra("MainToAchievements")
        }


        var scoreHighestText: TextView = findViewById<TextView>(R.id.scoreHighest)
        scoreHighestText.text = score


        // button back to homePage
        val backHome : Button =  findViewById<Button>(R.id.buttonHome)
        backHome.setOnClickListener {
            var i =  Intent(this, MainActivity::class.java)
           // i.putExtra(current, current)
            startActivity(i)
        }

        // button to new Game
        val resumeGame: Button = findViewById<Button>(R.id.buttonGame)
        resumeGame.setOnClickListener {
            var i =  Intent(this, LevelActivity::class.java)
            startActivity(i)
        }



    }

}