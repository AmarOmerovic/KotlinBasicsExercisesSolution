package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(hasSameLastDigit(41, 22, 71))
    println(hasSameLastDigit(23, 32, 42))
    println(hasSameLastDigit(9, 99, 999))

    println("\n********************************************************\n")

    println( isValid(10))
    println( isValid(468))
    println( isValid(1051))
}

fun hasSameLastDigit(a: Int, b: Int, c: Int): Boolean {
    if (a !in 10..1000 || b !in 10..1000 || c !in 10..1000) {
        return false
    }

    var temp = a.toString()
    val arrayA = temp.toCharArray()
    temp = b.toString()
    val arrayB = temp.toCharArray()
    temp = c.toString()
    var arrayC = temp.toCharArray()

    for (i in arrayA.indices) {
        for (j in arrayB.indices) {
            for (k in arrayC.indices) {
                if (arrayA.contains(arrayB[j]) || arrayB.contains(arrayC[k]) || arrayC.contains(
                        arrayA[i]
                    )
                ) {
                    return true
                }
            }
        }
    }
    return false
}

fun isValid(a: Int): Boolean {
    return a in 10..1000
}