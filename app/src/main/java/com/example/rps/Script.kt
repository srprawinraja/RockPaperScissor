package com.example.rps

fun main() {
    var choice=(1..3).random()
    var compMove=when(choice){
        1->"rock"
        2->"paper"
        else->"scissor"
    }
    println("enter your move")
    var humMove=readLine()
    println("computer choice $compMove")
    if (compMove == humMove) {
        println("It's a tie!")
    } else if ((choice == 1 && humMove == "scissor") || (choice == 3 && humMove == "paper")) {
        println("Computer wins!")
    } else {
        println("Human wins!")
    }
}