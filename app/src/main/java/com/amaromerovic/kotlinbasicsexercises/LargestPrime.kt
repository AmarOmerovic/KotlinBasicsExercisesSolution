package com.amaromerovic.kotlinbasicsexercises

import kotlin.math.sqrt

fun main() {
    println(getLargestPrime(21))
    println(getLargestPrime(217))
    println(getLargestPrime(0))
    println(getLargestPrime(45))
    println(getLargestPrime(-1))


}

fun getLargestPrime(number: Int): Int {

    if (number < 1) {
        return -1
    }

    var numCpy = number
    var maxprime = -1

    while (number % 2 == 0) {
        maxprime = 2
        numCpy /= 2
    }

    while (numCpy % 3 == 0) {
        maxprime = 3
        numCpy /= 3
    }

    for (i in 5..sqrt(numCpy.toDouble()).toInt() step 6) {
        while (numCpy % i == 0) {
            maxprime = i
            numCpy /= i
        }
        while (numCpy % (i + 2) == 0) {
            maxprime = i + 2
            numCpy /= (i + 2)
        }
    }

    if (numCpy > 4)
        maxprime = numCpy

    return maxprime

}

