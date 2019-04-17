package com.teamandroids.triviagame.application

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var media : MediaPlayer
    private var highestScore = "highest"
    private var soundOn = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent.hasExtra("0")){
            highestScore = intent.getStringExtra("0")
        }

        //Button initialization
        val gameOn : Button = findViewById<Button>(R.id.PlayButton)
        gameOn.setOnClickListener {
            var i =  Intent(this, LevelActivity::class.java)
            startActivity(i)
        }
        val rdm: Button = findViewById(R.id.buttonRandom)
        rdm.setOnClickListener {
            var i = Intent(this, gamePage::class.java)
            startActivity(i)
        }
        val settings : Button = findViewById(R.id.Settings)
        settings.setOnClickListener {
            var i = Intent(this, SettingsPage::class.java)
            startActivity(i)
        }
        val records : Button = findViewById<Button>(R.id.buttonRecord)
        records.setOnClickListener {
            var i = Intent(this, RecordsPage::class.java)
            startActivity(i)
        }

        val achievements : Button = findViewById<Button>(R.id.buttonAchievements)
        achievements.setOnClickListener {
            var i = Intent(this, Achievements::class.java)
            startActivity(i)
        }

        //Unsolved Media Switch
//        media = MediaPlayer.create(this, R.raw.homepage)
//        val music = findViewById<Button>(R.id.soundButton) as Button
//        media.start()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}

