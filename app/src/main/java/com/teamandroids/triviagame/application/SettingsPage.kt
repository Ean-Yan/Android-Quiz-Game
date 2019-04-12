package com.teamandroids.triviagame.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button
import android.widget.SeekBar

class SettingsPage : Activity() {

    // val science : Button = findViewById<Button>(R.id.ScienceButton)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_page)
        val achievements : Button = findViewById<Button>(R.id.achievements)

        val muteSounds : Button = findViewById<Button>(R.id.muteSounds)

        val muteMusic : Button = findViewById<Button>(R.id.muteMusic)

        val home : Button = findViewById<Button>(R.id.home)
        home.setOnClickListener {
            var i =  Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        val resume: Button = findViewById<Button>(R.id.resume)
        resume.setOnClickListener {
            var i =  Intent(this, gamePage::class.java)
            startActivity(i)
        }

        val sound : SeekBar = findViewById<SeekBar>(R.id.soundsSlider)

        val music: SeekBar = findViewById<SeekBar>(R.id.musicSlider)


    }

}