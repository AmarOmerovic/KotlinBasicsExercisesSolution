package com.amaromerovic.kotlinbasicsexercises

fun main() {
    var sum = 0
    var count = 0

    for (i in 1..1000) {
        if (i % 3 == 0 && i % 5 == 0) {
            sum += i
            count++

            if (count == 5) {
                break
            }
        }
    }

    println("The sum is $sum")
    println("The count is $count")
}
