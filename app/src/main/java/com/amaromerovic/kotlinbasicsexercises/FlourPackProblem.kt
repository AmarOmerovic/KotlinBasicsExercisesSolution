package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println(canPack(1, 0, 4))
    println(canPack(1, 0, 5))
    println(canPack(0, 5, 4))
    println(canPack(2, 2, 11))
    println(canPack(-3, 2, 12))
}

fun canPack(bigCount: Int, smallCount: Int, goal: Int): Boolean {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
        return false
    }

    for (i in 0..bigCount) {
        for (j in 0..smallCount) {
            if ((5 * i) + j == goal) {
                return true
            }
        }
    }
    return false
}