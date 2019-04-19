package com.teamandroids.triviagame.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button
import android.widget.SeekBar

class SettingsPage : Activity() {

    private var thisScore = "0"
    private var baseScore = "0"
    private var highestScore = "0"
    private var correctCount = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_page)

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

        val muteSounds : Button = findViewById<Button>(R.id.muteSounds)

        val muteMusic : Button = findViewById<Button>(R.id.muteMusic)

        val home : Button = findViewById<Button>(R.id.home)

        home.setOnClickListener {
            val i =  Intent(this, MainActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }

        val resume: Button = findViewById<Button>(R.id.resume)
        resume.setOnClickListener {
            val i =  Intent(this, gamePage::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }

        val sound : SeekBar = findViewById<SeekBar>(R.id.soundsSlider)

        val music: SeekBar = findViewById<SeekBar>(R.id.musicSlider)


    }

}