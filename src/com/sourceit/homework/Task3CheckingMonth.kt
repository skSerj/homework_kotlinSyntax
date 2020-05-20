package com.sourceit.homework

fun Int.checkMonthWith31Days(month: Int): Boolean {
    return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12
}

fun Int.checkMonthWith30Days(month: Int): Boolean {
    return month == 4 || month == 6 || month == 9 || month == 11
}

fun Int.checkLeapYear(year: Int): Boolean {
    return year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))
}