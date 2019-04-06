package com.example.jacobgraves.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.widget.Button

class LevelActivity : Activity() {

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
                var a =  gamePage()
                a.qtype = "Science"
                var i = Intent (this, gamePage::class.java)
                startActivity(i)
            }

        val politics : Button = findViewById<Button>(R.id.PoliticsButton)
        politics.setOnClickListener {
            var a =  gamePage()
            a.qtype = "History"
            var j = Intent (this, gamePage::class.java)
            startActivity(j)
        }
        val sports : Button = findViewById<Button>(R.id.SportsButton)
        sports.setOnClickListener {
            var k = Intent (this, gamePage::class.java)
            startActivity(k)
        }
        val history : Button = findViewById<Button>(R.id.HistoryButton)
        history.setOnClickListener {
            var l = Intent (this, gamePage::class.java)
            startActivity(l)
        }



        window.attributes=params
    }
}
