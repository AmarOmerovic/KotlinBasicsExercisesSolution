package com.amaromerovic.kotlinbasicsexercises

fun main() {
    printFactors(6)
    printFactors(32)
    printFactors(10)
    printFactors(-1)
}

fun printFactors(number: Int) {
    if (number < 0) println("Invalid Value") else {
        for (i in 1..number) {
            if (number % i == 0) {
                print("$i ")
            }
        }
    }
    println()
}