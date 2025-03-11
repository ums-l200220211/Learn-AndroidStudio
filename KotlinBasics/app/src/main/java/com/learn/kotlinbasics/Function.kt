package com.learn.kotlinbasics

// Call Function
fun main(){

    // Call Function

    makeCoffee(1,"Maulana")

    makeCoffee(2,"Jimmy")

    makeCoffee(30,"Helmi")

    makeCoffee(0,"Zul")
    makeCoffee(-1,"Naufal")

}



// Define Function

fun makeCoffee(sugarCount : Int , name : String){
    if(sugarCount == 2){
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
    else if (sugarCount == 0){
        println("Coffee with no sugar sugar for $name")
    }
    else if (sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
    else{
        println("Coffee with $sugarCount spoons of sugar for $name")
    }

}
