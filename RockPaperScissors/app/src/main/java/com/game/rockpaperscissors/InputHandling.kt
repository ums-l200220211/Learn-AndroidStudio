package com.game.rockpaperscissors

fun main(){
    println("Please enter a number : ")
    val inputString : String = readln()
    val inputNumber = inputString.toInt()

    val multiplier = 5
    val multiplication = inputNumber * multiplier
    println("The result is: $multiplication")
}