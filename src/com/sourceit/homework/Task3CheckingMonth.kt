package com.sourceit.homework

fun Int.checkMonthWith31Days(): Boolean {
    return this == 1 || this == 3 || this == 5 || this == 7 || this == 8 || this == 10 || this == 12
}

fun Int.checkMonthWith30Days(): Boolean {
    return this == 4 || this == 6 || this == 9 || this == 11
}

fun Int.checkLeapYear(): Boolean {
    return this % 400 == 0 || ((this % 4 == 0) && (this % 100 != 0))
}