package com.example.learnkotlin

fun main() {
    println("不可变list集合")

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")

    for (fruit in list) {
        println(fruit)
    }

    println()

    println("可变list集合")

    val list2 = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")

    list2.add("Watermelon")

    for (fruit in list2) {
        println(fruit)
    }

    println()

    println("不可变set集合")

    val set = setOf("Apple", "Banana", "Orange", "Pear", "Grape")

    for (fruit in set) {
        println(fruit)
    }

    println("可变set集合")

    val set2 = mutableSetOf("Apple", "Banana", "Orange", "Pear", "Grape")

    set2.add("add")

    println()

    println("Map集合 形式1")

    val map = HashMap<String, Int>()

    map.put("Apple", 1)
    map.put("Banana", 2)
    map.put("Orange", 3)

    println("Map集合 形式2")

    val map2 = HashMap<String, Int>()

    map2["Apple"] = 1
    map2["Banana"] = 2
    map2["Orange"] = 3

    println("Map集合 形式3")

    val map3 = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3)

    for ((fruit, number) in map3) {
        println("fruit is $fruit ,number is $number")
    }

}