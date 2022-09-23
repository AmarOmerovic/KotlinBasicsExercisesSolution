package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(sumOdd(1, 100))
    println(sumOdd(-1, 100))
    println(sumOdd(100, 100))
    println(sumOdd(13, 13))
    println(sumOdd(100, -100))
    println(sumOdd(100, 1000))
}

fun isOdd(number: Int): Boolean {
    return number > 0 && number % 2 != 0
}

fun sumOdd(start: Int, end: Int): Int {
    return if (start < 0 || end < 0 || end < start) return -1 else {
        var sum = 0
        for (i in start..end) {
            if (isOdd(i)) {
                sum += i
            }
        }
        sum
    }


}