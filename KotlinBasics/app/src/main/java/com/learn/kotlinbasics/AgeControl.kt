package com.learn.kotlinbasics

fun main(){
    println("Enter your age as a whole number: ")
    val inputUser = readln()
    val age = inputUser.toInt() // change data type from string to integer

    if(age in 1..17){ // from (age > 0 && age < 18)
        println("you are to young to join in club")
    }

    else if(age in 18..39){ // from (age >= 18 && age < 40)
        println("You can enter the club.")
    }

    else if(age >= 40){
        println("You cannot go into the club, please go home.")
    }

    else{
        println("Age not verified. Please contact support.")
    }
}