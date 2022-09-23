package com.amaromerovic.kotlinbasicsexercises

fun main() {

    printMegaBytesAndKiloBytes(2500)
    printMegaBytesAndKiloBytes(-1024)
    printMegaBytesAndKiloBytes(5000)

}

fun printMegaBytesAndKiloBytes(kiloBytes: Int) {

    if (kiloBytes < 0) {
        println("Invalid Value")
    } else {
        val megaBytes = kiloBytes / 1024
        val remainingKiloBytes = kiloBytes % 1024
        println("$kiloBytes KB = $megaBytes MB and $remainingKiloBytes KB")
    }

}