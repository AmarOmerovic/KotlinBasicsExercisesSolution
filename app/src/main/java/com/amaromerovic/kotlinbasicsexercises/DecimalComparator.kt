package com.amaromerovic.kotlinbasicsexercises

fun main() {

    println(areEqualByThreeDecimalPlaces(-3.1756, -3.175))
    println(areEqualByThreeDecimalPlaces(3.175, 3.176))
    println(areEqualByThreeDecimalPlaces(3.0, 3.0))
    println(areEqualByThreeDecimalPlaces(-3.123, 3.123))
}

fun areEqualByThreeDecimalPlaces(a: Double, b: Double): Boolean {
    return (a * 1000).toInt() == (b * 1000).toInt()
}