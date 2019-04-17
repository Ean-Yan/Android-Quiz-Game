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

    private var current = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scores_page)

        // using intent
        if(intent.hasExtra("pass")){
            current = intent.getStringExtra("pass")
        }

        var s: TextView = findViewById<TextView>(R.id.textScore)
        s.text = current

//        var t: TextView = findViewById(R.id.textTime)
//        t.text = t1;



        // button navigate to AchievementsPage
        val achievements : Button = findViewById<Button>(R.id.buttonAch)
        achievements.setOnClickListener {
            var i =  Intent(this, Achievements::class.java)
            startActivity(i)
        }

        // button back to homePage
        val backHome : Button =  findViewById<Button>(R.id.buttonHome)
        backHome.setOnClickListener {
            var i =  Intent(this, MainActivity::class.java)
            i.putExtra(current, current)
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