package com.sourceit.homework

fun main(args: Array<String>) {
    val day = 31
    val month = 1
    val year = 2020

    if (month.checkMonthWith31Days() && day > 0 && day <= 31) {
        println("дата введена корректно")
    } else if ((month.checkMonthWith30Days()) && day > 0 && day <= 30) {
        println("дата введена корректно")
    } else if (month == 2 && (year.checkLeapYear()) && day > 0 && day <= 29) {
        println("дата введена корректно")
    } else if (month == 2 && day > 0 && day <= 28) {
        println("дата введена корректно")
    } else {
        println("датта введена не корректно")
    }
}

