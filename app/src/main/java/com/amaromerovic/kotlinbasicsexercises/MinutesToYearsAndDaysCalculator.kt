package com.amaromerovic.kotlinbasicsexercises

fun main() {
    printYearsAndDays(525600)
    printYearsAndDays(1051200)
    printYearsAndDays(561600)
}

fun printYearsAndDays(minutes: Long) {
    if (minutes < 0) {
        println("Invalid Value")
    } else {
        println("$minutes min = " + minutes / (60 * 24 * 365) + " y and " + (minutes % (60 * 24 * 365)) / (60 * 24) + " d")
    }
}