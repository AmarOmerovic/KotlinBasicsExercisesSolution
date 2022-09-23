package com.amaromerovic.kotlinbasicsexercises

import kotlin.math.roundToLong

fun main() {
    println(toMilesPerHour(1.5))

    println(toMilesPerHour(10.25))
    println(toMilesPerHour(-5.6))
    println(toMilesPerHour(25.42))
    println(toMilesPerHour(75.114))


    printConversion(1.5)
    printConversion(10.25)
    printConversion(-5.6)
    printConversion(25.42)
    printConversion(75.114)
}

fun toMilesPerHour(kilometersPerHour: Double): Long {
    val kmInMile = 0.6214

    return if (kilometersPerHour < 0) {
        -1
    } else {
        return (kmInMile * kilometersPerHour).roundToLong()
    }
}

fun printConversion(kilometersPerHour: Double) {
    var milesPerHour: Any?
    val kmInMile = 0.6214

    if (kilometersPerHour < 0) {
        milesPerHour = "Invalid Value"
        println(milesPerHour)
    } else {
        milesPerHour = Math.round(kmInMile * kilometersPerHour)
        println("$kilometersPerHour km/h = $milesPerHour mi/h")
    }
}
