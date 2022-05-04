package com.example.learnkotlin

fun main() {

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")

    val lambda = { fruit: String -> fruit.length }

    val maxLength = list.maxByOrNull(lambda)

    val maxLength2 = list.maxByOrNull({ fruit: String -> fruit.length })

    val maxLength3 = list.maxByOrNull() { fruit: String -> fruit.length }

    val maxLength4 = list.maxByOrNull { fruit: String -> fruit.length }

    val maxLength5 = list.maxByOrNull { fruit -> fruit.length }

    val maxLength6 = list.maxByOrNull { it.length }

    val newList = list.map { it.toUpperCase() }

    for (f in newList) {
        println(f)
    }

    println()

    val newList2 = list.filter { it.length <= 5 }.map { it.toUpperCase() }

    for (f in newList2) {
        println(f)
    }

    println()

    val any = list.any { it.length <= 5 }
    val all = list.all { it.length <= 5 }

    println("any is $any , all is $all")
}