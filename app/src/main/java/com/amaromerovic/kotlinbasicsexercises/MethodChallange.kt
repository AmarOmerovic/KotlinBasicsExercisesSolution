package com.amaromerovic.kotlinbasicsexercises

fun main() {
    displayHighScorePosition("Maid", calculateHighScorePosition(50))
    displayHighScorePosition("Bilal", calculateHighScorePosition(900))
    displayHighScorePosition("Haris", calculateHighScorePosition(400))
    displayHighScorePosition("Amar", calculateHighScorePosition(1500))

    println("\n************************************************************************************\n")

    displayHighScorePosition("Maid", calculateHighScorePositionWithWhen(50))
    displayHighScorePosition("Bilal", calculateHighScorePositionWithWhen(900))
    displayHighScorePosition("Haris", calculateHighScorePositionWithWhen(400))
    displayHighScorePosition("Amar", calculateHighScorePositionWithWhen(1500))
}

fun displayHighScorePosition(playerName: String, position: Int) {
    println("$playerName managed to get into position $position on the high score table")
}

fun calculateHighScorePosition(playerScore: Int) : Int {
    return if (playerScore > 1000) {
        1
    } else if (playerScore > 500){
        2
    } else if (playerScore > 100) {
        3
    } else {
        4
    }
}


fun calculateHighScorePositionWithWhen(playerScore: Int) : Int {
    return when(playerScore) {
        in 1000..10000 -> 1
        in 500 until 1000 -> 2
        in 100 until 500 -> 3
        else -> 4
    }
}