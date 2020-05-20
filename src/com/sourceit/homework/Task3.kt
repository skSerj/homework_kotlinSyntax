package com.sourceit.homework

fun main(args: Array<String>) {
    val day = 29
    val month = 2
    val year = 2020

    if (month.checkMonthWith31Days(month) && day > 0 && day <= 31) {
        println("дата введена корректно")
    } else if ((month.checkMonthWith30Days(month)) && day > 0 && day <= 30) {
        println("дата введена корректно")
    } else if (month == 2 && (year.checkLeapYear(year)) && day > 0 && day <= 29) {
        println("дата введена корректно")
    } else if (month == 2 && day > 0 && day <= 28) {
        println("дата введена корректно")
    } else {
        println("датта введена не корректно")
    }
}

