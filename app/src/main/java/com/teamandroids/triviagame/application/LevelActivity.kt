package com.teamandroids.triviagame.application

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button

class LevelActivity : Activity() {

    var type = "QuestionType"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        var dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)

        val width = dm.widthPixels
        val height = dm.heightPixels

        window.setLayout((width*0.8).toInt(),(height*0.4).toInt())

        val params = window.attributes
        params.gravity = Gravity.CENTER
        params.x = 0
        params.y = -20

        val science : Button = findViewById<Button>(R.id.ScienceButton)
            science.setOnClickListener {
                var i = Intent (this, gamePage::class.java)
                i.putExtra(type, "Science")
                startActivity(i)
            }

        val politics : Button = findViewById<Button>(R.id.PoliticsButton)
            politics.setOnClickListener {

                var i = Intent (this, gamePage::class.java)
                i.putExtra(type, "Politics")
                startActivity(i)
            }
        val sports : Button = findViewById<Button>(R.id.SportsButton)
            sports.setOnClickListener {
                var i = Intent (this, gamePage::class.java)
                i.putExtra(type, "Sports")
                startActivity(i)
            }
        val history : Button = findViewById<Button>(R.id.RetryButton)
            history.setOnClickListener {
                var i = Intent (this, gamePage::class.java)
                i.putExtra(type, "History")
                startActivity(i)
            }
        window.attributes=params
    }
}
