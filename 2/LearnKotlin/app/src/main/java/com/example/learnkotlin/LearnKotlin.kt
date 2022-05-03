package com.example.learnkotlin

import kotlin.math.max

fun main() {
    println("Hello kotlin!")

    println()

    var a = 10

    println("a=" + a)

    println()

    println("val表示不可变变量")
    //val b: Int = 10

    var b: Int = 10

    b = b * 10

    println("b=" + b)

    println()

    println("当val无法满足需求时再用var")

    println()

    val v = largerNumber(5, 3)

    println(v)

    println()

    checkNumber(8)

    checkNumber(8L)

    println()

    println("..表示区间")
    for (i in 0..5) {
        println(i)
    }

    println("左闭右开区间")
    for (i in 0 until 5) {
        println(i)
    }

    println("step表示循环变量递增几")
    for (i in 0 until 5 step 2) {
        println(i)
    }

    println("downTo表示降序")
    for (i in 0 downTo 5) {
        println(i)
    }

    println()

}

fun largerNumber(num1: Int, num2: Int): Int {
    return max(num1, num2)
}

//简写形式
fun largerNumber2(num1: Int, num2: Int): Int = max(num1, num2)
fun largerNumber3(num1: Int, num2: Int) = max(num1, num2)

fun largerNumber4(num1: Int, num2: Int): Int {
    println("if 可以有返回值")

    val value = if (num1 > num2) {
        num1
    } else {
        num2
    }

    return value
}

fun largerNumber5(num1: Int, num2: Int): Int {
    println("简写形式")

    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}

//简写形式
fun largerNumber6(num1: Int, num2: Int) = if (num1 > num2) {
    num1
} else {
    num2
}

//简写形式
fun largerNumber7(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

//when
fun getScore(name: String) = when (name) {
    "Tom" -> 8
    "Jim" -> 7
    "Jack" -> 5
    else -> 0
}

//when另一种形式
fun getScore2(name: String) = when {
    name.startsWith("Tom") -> 8
    name == "Jim" -> 7
    name == "Jack" -> 5
    else -> 0
}

//类型匹配
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("$num is Int")
        is Double -> println("$num is Double")
        else -> println("$num is not support")
    }
}
