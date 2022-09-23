package com.amaromerovic.kotlinbasicsexercises

fun main() {

    println(hasTeen(9, 99, 19))
    println(hasTeen(23, 15, 42))
    println(hasTeen(22, 23, 34))

    println(isTeen(9))
    println(isTeen(13))
}

fun hasTeen(a: Int, b: Int, c: Int): Boolean {
    return a in 13..19 || b in 13..19 || c in 13..19
}

fun isTeen(a: Int): Boolean {
    return a in 13..19
}