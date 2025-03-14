package com.learn.kotlinbasics

data class coffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size:String,
    val creamAmount:Int
)
// Call Function
fun main(){


    // Call Function
    println("Who is coffee for ?")
    val name = readln()
    println("How many pieces of sugar do you want ?")
    val sugarCount = readln().toInt()

    makeCoffee(sugarCount,name)

}


// Define Function

//
//
fun makeCoffee(sugarCount: Int, name: String){
    if(sugarCount > 1){
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
    else if (sugarCount == 0){
        println("Coffee with no sugar sugar for $name")
    }
    else if (sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
    else{
        println("No Coffee for anyone")
    }

}





