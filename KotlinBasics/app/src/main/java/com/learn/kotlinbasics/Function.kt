package com.learn.kotlinbasics

// Call Function
fun main(){

    add(1,4)
    // Call Function
    println("Who is coffee for ?")
    val name = readln()
    println("How many pieces of sugar do you want ?")
    val sugarCount = readln().toInt()

    makeCoffee(sugarCount,name)

//    println("Do you want make a coffee again ? Please select Yes or No")
//    val makeDecision = readln().trim().lowercase()
//    makeAnotherCoffee(makeDecision)

}


fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}




// Define Function
//fun makeAnotherCoffee(makeDecision: String) {
//    if (makeDecision == "yes"){
//        return makeCoffee()
//    }
//}


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






