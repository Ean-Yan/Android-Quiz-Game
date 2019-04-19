package com.teamandroids.triviagame.application

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {


    private var ifPassRecords = 0
    private var ifPassAchievements = 0
    private lateinit var media : MediaPlayer
    var soundOn = true
    private var thisScore = "0"
    private var baseScore ="0"
    private var highestScore = "0"
    private var correctCount = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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



        //Button initialization
        val gameOn : Button = findViewById<Button>(R.id.PlayButton)
        gameOn.setOnClickListener {
            val i =  Intent(this, LevelActivity::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }
        val rdm: Button = findViewById(R.id.buttonRandom)
        rdm.setOnClickListener {
            val i = Intent(this, gamePage::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }
        val settings : Button = findViewById(R.id.Settings)
        settings.setOnClickListener {
            val i = Intent(this, SettingsPage::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }
        val records : Button = findViewById<Button>(R.id.buttonRecord)
        records.setOnClickListener {
            val i = Intent(this, RecordsPage::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
            startActivity(i)
        }
        val achievements : Button = findViewById<Button>(R.id.buttonAchievements)
        achievements.setOnClickListener {
            val i = Intent(this, Achievements::class.java)
            i.putExtra("baseScore", baseScore)
            i.putExtra("thisScore", thisScore)
            i.putExtra("HighestScore", highestScore)
            i.putExtra("correctCount", correctCount)
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

