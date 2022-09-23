package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(getDigitCount(0))
    println(getDigitCount(123))
    println(getDigitCount(-12))
    println(getDigitCount(5200))

    println("\n************************************************************\n")

    println(reverse(-121))
    println(reverse(1212))
    println(reverse(1234))
    println(reverse(100))

    println("\n************************************************************\n")

    numberToWords(123)
    numberToWords(1010)
    numberToWords(1000)
    numberToWords(-12)

}

fun numberToWords(number: Int) {
    if (number < 0) println("Invalid Value") else {
        var reversedNum = reverse(number)
        var end = getDigitCount(number);
        if (end != -1) {
            for (i in 0 until end) {
                when (reversedNum % 10) {
                    0 -> print("Zero")
                    1 -> print("One")
                    2 -> print("Two")
                    3 -> print("Three")
                    4 -> print("Four")
                    5 -> print("Five")
                    6 -> print("Six")
                    7 -> print("Seven")
                    8 -> print("Eight")
                    9 -> print("Nine")
                    else -> break
                }
                print(" ")
                reversedNum /= 10
            }
        }
    }
    println()
}

fun reverse(number: Int): Int {
    var passedNumber = number
    var reversed = 0
    var digit: Int

    while (passedNumber != 0) {
        digit = passedNumber % 10
        reversed = reversed * 10 + digit
        passedNumber /= 10
    }
    return reversed
}


fun getDigitCount(number: Int): Int {
    if (number < 0) {
        return -1
    }

    var passedNum = number
    var count = 1

    while (passedNum > 9) {
        passedNum /= 10
        count++
    }

    return count
}