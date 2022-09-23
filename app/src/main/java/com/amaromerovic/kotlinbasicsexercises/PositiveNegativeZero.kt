package com.amaromerovic.kotlinbasicsexercises

fun main() {
    checkNumber(9844)
    checkNumber(-4894)
    checkNumber(1)
    checkNumber(0)
    checkNumber(-1)

    println("\n************************************************************************************\n")


    checkNumberWithWhen(9844)
    checkNumberWithWhen(-4894)
    checkNumberWithWhen(1)
    checkNumberWithWhen(0)
    checkNumberWithWhen(-1)
}

fun checkNumber(number: Int) {
    if (number > 0) {
        println("Positive")
    } else if (number < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}

fun checkNumberWithWhen(number: Int) {
    when(number) {
        in 1..Int.MAX_VALUE -> println("Positive")
        in Int.MIN_VALUE until 0 -> println("Negative")
        else -> println("Zero")
    }
}