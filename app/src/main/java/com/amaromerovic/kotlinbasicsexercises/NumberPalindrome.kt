package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(isPalindrome(-1221))
    println(isPalindrome(707))
    println(isPalindrome(11212))
}

fun isPalindrome(number: Int): Boolean {
    var temp = number
    var help: Int
    var reversed = 0

    while (temp != 0) {
        help = temp % 10
        reversed = (reversed * 10) + help
        temp /= 10
    }

    return number == reversed
}