package com.teamandroids.triviagame.application.Database

class Question(
    var QType: String, //The category of the question
    var QDiff: Int, //The difficulty of the question
    var Question: String, //The question itself
    var Answer1a: String, //First choice
    var Answer2b: String, //Second choice
    var Answer3c: String, //Third choice
    var Answer4d: String, //fourth choice
    var correct: Int, //Which one is correct
    var wasUsed: Boolean) //To check which questions were used, not used in the program