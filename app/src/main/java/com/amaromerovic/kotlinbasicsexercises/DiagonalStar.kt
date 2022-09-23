package com.amaromerovic.kotlinbasicsexercises

fun main() {
    printSquareStar(5)

    println("\n\n")

    printSquareStar(8)
}

fun printSquareStar(number: Int) {
    if (number < 5) {
        println("Invalid Value")
    }

    for (i in 0 until number) {
        for (j in 0 until number) {
            if (j == 0 || i == 0 || i == number -1 || j == (number - 1) || i == j || i + j == number - 1) {
                print("*")
            } else {
                print(" ")
            }

            if (j == number - 1) {
                println()
            }
        }
    }
}
