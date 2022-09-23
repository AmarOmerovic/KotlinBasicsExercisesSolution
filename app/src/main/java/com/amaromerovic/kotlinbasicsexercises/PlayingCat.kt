package com.amaromerovic.kotlinbasicsexercises

fun main() {
    println( isCatPlaying(true, 10))
    println( isCatPlaying(false, 36))
    println( isCatPlaying(false, 35))
}

fun isCatPlaying(summer: Boolean, temperature: Int): Boolean {
    return ((summer && temperature in 25..45) || (!summer && temperature in 25..35))
}