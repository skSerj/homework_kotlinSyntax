package com.sourceit.homework

fun main(args: Array<String>) {
    val a = 3
    val b = 2
    val c = 4

    if (a < b && b < c) {
        println("sum of 2 biggest num: " + (b * b + c * c))
    } else if (a > b && b < c) {
        println("sum of two biggest num: " + (a * a + c * c))
    } else if (a > c && b > c) {
        println("sum of two biggest num: " + (a * a + b * b))
    } else
        println("wrong")
}