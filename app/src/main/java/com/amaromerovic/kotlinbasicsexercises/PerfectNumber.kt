package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(isPerfectNumber(6))
    println(isPerfectNumber(28))
    println(isPerfectNumber(5))
    println(isPerfectNumber(-1))
}

fun isPerfectNumber(number: Int): Boolean {
    if (number < 1) {
        return false
    }
    var sum = 0
    for (i in 1 until number) {
        if (number % i == 0) {
            sum += i
        }
    }

    return sum == number
}