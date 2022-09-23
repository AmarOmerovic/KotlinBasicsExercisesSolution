package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(hasSharedDigit(12, 23))
    println(hasSharedDigit(9, 99))
    println(hasSharedDigit(15, 55))
    println(hasSharedDigit(22, 33))

}

fun hasSharedDigit(a: Int, b: Int): Boolean {
    if (a !in 10..99 || b !in 10..99) {
        return false
    }

    var temp = a.toString()
    val aDigits = temp.toCharArray()
    temp = b.toString()
    val bDigits = temp.toCharArray()

    for (i in aDigits.indices) {
        for (j in bDigits.indices) {
            if (aDigits[i] == bDigits[j]) {
                return true
            }
        }
    }

    return false
}
