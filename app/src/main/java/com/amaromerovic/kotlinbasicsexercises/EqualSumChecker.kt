package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println( hasEqualSum(1, 1, 1))
    println( hasEqualSum(1, 1, 2))
    println( hasEqualSum(1, -1, 0))
}

fun hasEqualSum(a: Int, b: Int, c: Int): Boolean {
    return a + b == c
}