package com.sourceit.homework

fun main(args: Array<String>) {
    val int = 992

    val numColor = when (java.lang.Integer.toHexString(int)) {
        "3dc" -> "White"  //988
        "3dd" -> "Black" //989
        "3de" -> "Red"  // 990
        "3df" -> "Green" //991
        "3e0" -> "Blue" //992
        else -> "invalid int"
    }
    println("you color is: $numColor")
}