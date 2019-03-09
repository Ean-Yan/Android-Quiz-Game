package com.example.jacobgraves.myapplication

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.example.jacobgraves.myapplication.Database.Question
import kotlinx.android.synthetic.main.activity_game_page.*

class MainActivity : AppCompatActivity() {
    private lateinit var media : MediaPlayer
    var soundOn = true
    var questionView: TextView? = null
    var Score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gameOn : Button = findViewById(R.id.PlayButton)
        gameOn.setOnClickListener {
            startNewGame(true)
        }

        //Unsolved Media Switch
        questionView = findViewById(R.id.QuestionView)
        media = MediaPlayer.create(this, R.raw.homepage)
        var music = findViewById<Button>(R.id.soundButton) as Button
//        music.setOnClickListener {
//            soundOn = !soundOn
//        }
//        if(soundOn){
//            media.start()
//        }

    }

    private fun startNewGame(clickListener: Boolean){
        questionView?.text="Question 1"
        val toQuestionPage = Intent(this, gamePage :: class.java)
        startActivity(toQuestionPage)
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

