package com.amaromerovic.kotlinbasicsexercises

import java.util.Scanner

fun main() {
    inputThenPrintSumAndAverage()
}

fun inputThenPrintSumAndAverage() {
    var scanner = Scanner(System.`in`)
    var count = 0
    var sum = 0

    while (scanner.hasNextInt()) {
        sum += scanner.nextInt()
        scanner.nextLine()
        count ++
    }
    var avg = if (sum != 0 && count != 0) sum / count else 0

    println("SUM = $sum | AVG = $avg")
}