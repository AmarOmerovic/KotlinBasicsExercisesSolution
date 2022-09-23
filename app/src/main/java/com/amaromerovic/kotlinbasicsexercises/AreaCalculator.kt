package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(area(5.0))
    println( area(-1.0))
    println( area(5.0, 4.0))
    println( area(-1.0, 4.0))
}

fun area(radius: Double): Double {
    if (radius < 0) {
        return -1.0
    }
    return radius * radius * Math.PI
}

fun area(x: Double, y: Double): Double {
    if (x < 0 || y < 0) {
        return -1.0
    }
    return x * y
}