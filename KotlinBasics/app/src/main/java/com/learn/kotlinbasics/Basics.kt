package com.learn.kotlinbasics

fun main(){
//    println("Hello Naufal!")
    val myBook = Book()

    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublised)

    val customBook = Book("Atomic Habits","James Clear",2018)
    println("The title is ${customBook.title} author by ${customBook.author} and published in ${customBook.yearPublised}")

    customBook.yearPublised = 2020
    println("The title is ${customBook.title} author by ${customBook.author} and published in ${customBook.yearPublised}")
}

