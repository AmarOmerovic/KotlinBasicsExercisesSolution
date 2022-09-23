package com.amaromerovic.kotlinbasicsexercises

fun main() {
    printEqual(1, 1, 1)
    printEqual(1, 1, 2)
    printEqual(-1, -1, -1)
    printEqual(1, 2, 3)
}

fun printEqual(a: Int, b: Int, c: Int) {
    if (a < 0 || b < 0 || c < 0) {
        println("Invalid Value")
    } else if (a == b && b == c) {
        println("All numbers are equal")
    } else if (a != b && b != c) {
        println("All numbers are different")
    } else {
        println("Neither all are equal or different")
    }
}