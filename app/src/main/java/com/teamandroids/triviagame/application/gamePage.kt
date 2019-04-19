package com.teamandroids.triviagame.application

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.teamandroids.triviagame.application.Database.QuestionBuilder
import kotlinx.android.synthetic.main.activity_game_page.*

class gamePage : AppCompatActivity() {

    private var qtype = "QuestionType"
    var title = "Score "
    var title2 = "Question "
    private var builder = QuestionBuilder()
    private var choice = 0
    private var score = 0
    private var correctCount = 0
    private var passScore = "pass"   //Pass score to EndPage intent
    private var baseScore = "0"
    private var receivedThisScore = "0"
    private var highestScore = "0"



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_game_page)

        //Get question type from levelActivity
		if(intent.hasExtra("QuestionType")){
             qtype = intent.getStringExtra("QuestionType")
        }
        if (intent.hasExtra("baseScore")){
            baseScore = intent.getStringExtra("baseScore")
        }
        if(intent.hasExtra("thisScore")){
            receivedThisScore = intent.getStringExtra("thisScore")
        }
        //update base score
        baseScore = (baseScore.toInt()+receivedThisScore.toInt()).toString()
        //receive highest Score
        if(intent.hasExtra("HighestScore")){
            highestScore = intent.getStringExtra("HighestScore")
        }
        if(intent.hasExtra("correctCount")){
            correctCount = intent.getStringExtra("correctCount").toInt()
        }

        //Initialize Buttons
        val ans1 = findViewById<Button>(R.id.Answer1a)
        val ans2 = findViewById<Button>(R.id.Answer2b)
        val ans3 = findViewById<Button>(R.id.Answer3c)
        val ans4 = findViewById<Button>(R.id.Answer4d)
        val scoreT=findViewById<TextView>(R.id.Score)
        val qCounter = findViewById<TextView>(R.id.QuestionNumber)

        //Build list based on type
        val list  = builder.getQuestionList(qtype)

        var i=0
        var qNum=1
        var question = list.get(i)
        QuestionView.text=question.Question
        ans1.text = question.Answer1a
        ans2.text = question.Answer2b
        ans3.text = question.Answer3c
        ans4.text = question.Answer4d
        question.wasUsed=true

        val answer1a : Button = findViewById<Button>(R.id.Answer1a)
        answer1a.setOnClickListener {
            choice=1
            if (choice==question.correct){//correct answer code goes here
                score+=(100*question.QDiff)
                correctCount+=1
            }else{

            }

            if(i<19) {//if the questions haven't reach the end
                i++
                qNum++
            }else{    // if done, navigate to EndPage
                val t =  Intent(this, EndPage::class.java)
                t.putExtra(passScore, score.toString())
                t.putExtra("baseScore", baseScore)
                t.putExtra("correctCount", correctCount.toString())
                if(score>=highestScore.toInt()){
                    t.putExtra("HighestScore", score.toString())
                }else{
                    t.putExtra("HighestScore", highestScore)
                }
                startActivity(t)
            }
            question = list.get(i)
            scoreT.text = title + score.toString()
            qCounter.text = title2 + qNum.toString()
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=true

        }
        val answer2b : Button = findViewById<Button>(R.id.Answer2b)
        answer2b.setOnClickListener {
            choice=2
            if (choice==question.correct){//correct answer code goes here
                score+=(100*question.QDiff)
                correctCount+=1
            }
            else{}
            if(i<19) { //if the questions haven't reach the end
                i++
                qNum++
            }
            else{       // if done, navigate to EndPage
                val t =  Intent(this, EndPage::class.java)
                t.putExtra(passScore, score.toString())
                t.putExtra("baseScore", baseScore)
                t.putExtra("correctCount", correctCount.toString())
                if(score>=highestScore.toInt()){
                    t.putExtra("HighestScore", score.toString())
                }else{
                    t.putExtra("HighestScore", highestScore)
                }
                startActivity(t)
            }
            question = list.get(i)
            scoreT.text = title + score.toString()
            qCounter.text = title2+qNum.toString()
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false
        }
        val answer3c : Button = findViewById<Button>(R.id.Answer3c)
        answer3c.setOnClickListener {
            choice=3
            if (choice==question.correct){//correct answer code goes here
                score+=(100*question.QDiff)
                correctCount+=1
            }
            else{}
            if(i<19) { //if the questions haven't reach the end
                i++
                qNum++
            }
            else{       // if done, navigate to EndPage
                val t =  Intent(this, EndPage::class.java)
                t.putExtra(passScore, score.toString())
                t.putExtra("baseScore", baseScore)
                t.putExtra("correctCount", correctCount.toString())
                if(score>=highestScore.toInt()){
                    t.putExtra("HighestScore", score.toString())
                }else{
                    t.putExtra("HighestScore", highestScore)
                }
                startActivity(t)
            }
            question = list.get(i)
            scoreT.text = title + score.toString()
            qCounter.text = title2+qNum.toString()
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false
        }
        val answer4d : Button = findViewById<Button>(R.id.Answer4d)
        answer4d.setOnClickListener {
            choice=4
            if (choice==question.correct){//correct answer code goes here
                score+=(100*question.QDiff)
                correctCount+=1
            }
            else{}
            if(i<19) { //if the questions haven't reach the end
                i++
                qNum++
            }
            else{       // if done, navigate to EndPage
                val t =  Intent(this, EndPage::class.java)
                t.putExtra(passScore, score.toString())
                t.putExtra("baseScore", baseScore)
                t.putExtra("correctCount", correctCount.toString())
                if(score>=highestScore.toInt()){
                    t.putExtra("HighestScore", score.toString())
                }else{
                    t.putExtra("HighestScore", highestScore)
                }
                startActivity(t)
            }
            question = list.get(i)
            scoreT.text = title + score.toString()//
            qCounter.text = title2+qNum.toString()
			QuestionView.text=question.Question
			ans1.text = question.Answer1a
			ans2.text = question.Answer2b
			ans3.text = question.Answer3c
			ans4.text = question.Answer4d
			question.wasUsed=false
        }

    }
}
