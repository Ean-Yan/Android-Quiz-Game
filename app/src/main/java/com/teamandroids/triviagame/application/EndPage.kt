package com.teamandroids.triviagame.application

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button
import android.widget.TextView

class EndPage : AppCompatActivity() {
    private var current = "0"
    var previous = "type"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_page)

        //PopWindow Settings
        var dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)
        val params = window.attributes
        params.gravity = Gravity.CENTER
        params.x = 0
        params.y = -20

        //Pass variables through intent
        if(intent.hasExtra("pass")){
            current = intent.getStringExtra("pass")
            //previous = intent.getStringExtra("QuestionType")
        }

        //Show score
        var score: TextView = findViewById<TextView>(R.id.endScore)
        score.text = current

        //Return Button
        var returnM: Button = findViewById<Button>(R.id.MenuButton)
        returnM.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            i.putExtra(current, current)
            startActivity(i)
        }

        //Retry Button
        var retryB: Button = findViewById(R.id.RetryButton)
        retryB.setOnClickListener {
            var i = Intent(this, LevelActivity::class.java)
            startActivity(i)
        }

        window.attributes=params
    }
}
