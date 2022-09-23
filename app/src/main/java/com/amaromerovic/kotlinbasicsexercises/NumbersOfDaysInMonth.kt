package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(leapYear(-1600))
    println(leapYear(1600))
    println(leapYear(2017))
    println(leapYear(2000))

    println( getDaysInMonth(1, 2020))
    println( getDaysInMonth(2, 2020))
    println( getDaysInMonth(2, 2018))
    println( getDaysInMonth(-1, 2020))
    println( getDaysInMonth(1, -2020))
}

fun leapYear(year: Int): Boolean {
    if (year !in 1..9999) {
        return false
    }
    return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
}

fun getDaysInMonth(month: Int, year: Int): Int {
    if (month !in 1..12 || year !in 1..9999) {
        return -1
    }
    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> if (leapYear(year)) 29 else 28
        else -> -1
    }
}