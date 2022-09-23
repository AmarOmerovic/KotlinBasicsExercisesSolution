package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(getGreatestCommonDivisor(25, 15))
    println(getGreatestCommonDivisor(12, 30))
    println(getGreatestCommonDivisor(9, 18))
    println(getGreatestCommonDivisor(81, 153))
}

fun getGreatestCommonDivisor(first: Int, second: Int): Int {
    var firstNumber = first
    var secondNumber = second

    if (first < 10 || second < 10) {
        return -1
    }

    while (firstNumber != secondNumber) {
        if (firstNumber > secondNumber) {
            firstNumber -= secondNumber
        } else {
            secondNumber -= firstNumber
        }
    }
    return firstNumber
}