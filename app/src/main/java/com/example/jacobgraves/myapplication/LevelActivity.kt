package com.example.jacobgraves.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
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

        val Science : Button = findViewById<Button>(R.id.ScienceButton)
            Science.setOnClickListener {
                var i = Intent (this, gamePage::class.java)
                i.type="Science"
                startActivity(i)

            }
        val Politics : Button = findViewById<Button>(R.id.PoliticsButton)
        Science.setOnClickListener {
            var i = Intent (this, gamePage::class.java)
            i.type="Politics"
            startActivity(i)

        }
        val Sports : Button = findViewById<Button>(R.id.SportsButton)
        Science.setOnClickListener {
            var i = Intent (this, gamePage::class.java)
            i.type="Sports"
            startActivity(i)

        }
        val History : Button = findViewById<Button>(R.id.HistoryButton)
        Science.setOnClickListener {
            var i = Intent (this, gamePage::class.java)
            i.type="History"
            startActivity(i)
        }



        window.attributes=params
    }
}
