package com.learn.kotlinbasics

fun main() {
    println("Enter number 1")
    val num1Str = readln()
    val num1Int = num1Str.toDouble()
    println("Enter number 2")
    val num2Str = readln()
    val num2Int = num2Str.toDouble()
//    val myResult = add(num1Int,num2Int)
    val myResult = divide(num1Int,num2Int)
    println("The result is $myResult")
}

fun add(num1:Int,num2:Int):Int{
    val result = num1+num2
    return result
}

fun divide(num1:Double,num2:Double):Double{
    val result = num1/num2
    return result
}