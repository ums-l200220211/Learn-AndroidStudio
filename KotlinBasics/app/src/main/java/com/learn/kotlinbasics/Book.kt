package com.learn.kotlinbasics

class Book (val title: String = "Unknown", val  author : String = "Anonymous", var yearPublised : Int = 2025) {

    init {
        color(title)
    }
    fun color(title: String){
        println("$title white color of book")
    }
}


