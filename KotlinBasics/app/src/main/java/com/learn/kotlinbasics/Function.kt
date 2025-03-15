package com.learn.kotlinbasics

data class coffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size:String,
    val creamAmount:Int
)
// Call Function
fun main(){
    val coffeeForZul = coffeeDetails(2,"Zul", "Small", 3)
    makeCoffee(coffeeForZul)

//    // Call Function
//    println("Who is coffee for ?")
//    val name = readln()
//    println("How many pieces of sugar do you want ?")
//    val sugarCount = readln().toInt()
//
//    makeCoffee(sugarCount,name)

}


// Define Function

//
//
fun makeCoffee(coffeeDetails: coffeeDetails){
    if(coffeeDetails.sugarCount > 1){
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
    }
    else if (coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar sugar for ${coffeeDetails.name}")
    }
    else if (coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    }
    else{
        println("No Coffee for anyone")
    }

}





