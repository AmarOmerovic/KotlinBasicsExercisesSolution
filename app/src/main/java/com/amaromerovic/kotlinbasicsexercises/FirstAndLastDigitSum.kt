package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(sumFirstAndLastDigit(252))
    println(sumFirstAndLastDigit(257))
    println(sumFirstAndLastDigit(0))
    println(sumFirstAndLastDigit(5))
    println(sumFirstAndLastDigit(-10))
}

fun sumFirstAndLastDigit(number: Int): Int {

    if (number < 0) {
        return -1
    }

    var numCopy = number
    var sum = 0
    var digit: Int

    while (numCopy > 0) {
        digit = numCopy % 10
        if (numCopy == number) {
            sum += digit
        }
        if (numCopy / 10 == 0) {
            sum += digit
        }
        numCopy /= 10
    }

    return sum

}
