package com.game.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    val validChoices = listOf("rock", "paper", "scissors")
     //Loop sampai pemain memberikan input yang valid
    while (true) {
        println("Rock, Paper, or Scissors? Enter your choice!")
        playerChoice = readln().lowercase()

        if (playerChoice in validChoices) {
            break
        } else {
            println("Invalid input! Please enter 'Rock', 'Paper', or 'Scissors'.")
        }
    }


    val randomNumber = (1..3).random()

    computerChoice = when (randomNumber) { // use if else condition
        1 -> {
            "Rock"
        }
        2 -> {
            "Paper"
        }
        else -> {
            "Scissors"
        }
    }



    if( (playerChoice == "rock" && computerChoice == "Rock") || (playerChoice == "paper" && computerChoice == "Paper") || (playerChoice == "scissors" && computerChoice == "Scissors") ){
        println("Computer Choice : $computerChoice")
        println("It's a Tie")
    }
    else if ( (playerChoice == "rock" && computerChoice == "Scissors") || (playerChoice == "paper" && computerChoice == "Rock") || (playerChoice == "scissors" && computerChoice == "Paper")){
        println("Computer Choice : $computerChoice")
        println("You Win!")
    }
    else if ((playerChoice == "rock" && computerChoice == "Paper") || (playerChoice == "paper" && computerChoice == "Scissors") || (playerChoice == "scissors" && computerChoice == "Rock")) {
        println("Computer Choice : $computerChoice")
        println("You Lose!")
    }
    else {
      println("unknown input")
    }
//    println("Wanna play again? select yes or not?")


}


//package com.game.rockpaperscissors
//
//fun main() {
//    val validChoices = listOf("rock", "paper", "scissors")
//    var playerChoice: String
//
//    // Loop sampai pemain memberikan input yang valid
//    while (true) {
//        println("Rock, Paper, or Scissors? Enter your choice!")
//        playerChoice = readln().trim().lowercase()
//
//        if (playerChoice in validChoices) {
//            break
//        } else {
//            println("Invalid input! Please enter 'rock', 'paper', or 'scissors'.")
//        }
//    }
//
//    // Komputer memilih secara acak
//    val computerChoice = when ((1..3).random()) {
//        1 -> "rock"
//        2 -> "paper"
//        else -> "scissors"
//    }
//
//    println("Computer chose: $computerChoice")
//
//    // Menentukan hasil permainan
//    when {
//        playerChoice == computerChoice -> println("It's a Tie!")
//        (playerChoice == "rock" && computerChoice == "scissors") ||
//                (playerChoice == "paper" && computerChoice == "rock") ||
//                (playerChoice == "scissors" && computerChoice == "paper") -> {
//            println("You Win!")
//        }
//        else -> println("You Lose!")
//    }
//}
