package com.amaromerovic.kotlinbasicsexercises

fun main() {
    printNumberInWord(1)
    printNumberInWord(5)
    printNumberInWord(12)
    printNumberInWord(0)
    printNumberInWord(-1)
}

fun printNumberInWord(num: Int) {
    when(num) {
        0 -> println("ZERO")
        1 -> println("ONE")
        2 -> println("TWO")
        3 -> println("THREE")
        4 -> println("FOUR")
        5 -> println("FIVE")
        6 -> println("SIX")
        7 -> println("SEVEN")
        8 -> println("EIGHT")
        9 -> println("NINE")
        else -> println("OTHER")
    }
}