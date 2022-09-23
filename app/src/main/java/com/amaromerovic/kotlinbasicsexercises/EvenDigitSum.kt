package com.amaromerovic.kotlinbasicsexercises

fun main() {

    println(getEvenDigitSum(123456789))
    println(getEvenDigitSum(252))
    println(getEvenDigitSum(-22))
}

fun getEvenDigitSum(number: Int): Int {
    if (number < 0) {
        return -1
    }

    var sum = 0
    var digit: Int
    var numCopy = number

    while (numCopy > 0) {
        digit = numCopy % 10
        if (digit % 2 == 0) {
            sum += digit
        }
        numCopy /= 10
    }

    return sum
}