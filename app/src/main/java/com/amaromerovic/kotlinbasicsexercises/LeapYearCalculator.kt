package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(isLeapYear(-1600))
    println(isLeapYear(1600))
    println(isLeapYear(2017))
    println(isLeapYear(2000))
}

fun isLeapYear(year: Int): Boolean {
    val isValid: Boolean = year in 1..9999

    if (isValid) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0
            } else {
                return true
            }
        } else {
            return false
        }


    } else {
        return false;
    }

}