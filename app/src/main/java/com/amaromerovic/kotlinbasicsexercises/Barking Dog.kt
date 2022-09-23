package com.amaromerovic.kotlinbasicsexercises

fun main() {

    println(shouldWakeUp (true, 1))
    println(shouldWakeUp (false, 2))
    println(shouldWakeUp (true, 8))
    println( shouldWakeUp (true, -1))
}

fun shouldWakeUp(isBarking: Boolean, hourOfDay: Int): Boolean {
    return when(hourOfDay) {
        in 0 until 8, 23 -> {
            isBarking
        }
        else -> return false
    }
}