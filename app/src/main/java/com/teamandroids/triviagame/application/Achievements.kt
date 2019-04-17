package com.teamandroids.triviagame.application

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class Achievements : AppCompatActivity() {

    private var current = "0"
    private var current2 = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievement_page)

      // below need to be fixed

//        if(intent.hasExtra("pass")){
//            current = intent.getStringExtra("pass")
//        }
//
//        var s1: TextView = findViewById<TextView>(R.id.scoreHighest)
//        s1.text = current


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