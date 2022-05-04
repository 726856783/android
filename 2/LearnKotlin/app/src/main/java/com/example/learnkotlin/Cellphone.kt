package com.example.learnkotlin

//数据类
data class Cellphone(val brand: String, val price: Double)

fun main() {
    val c1 = Cellphone("S", 1299.0)
    val c2 = Cellphone("S", 1299.0)

    println(c1)
    println("c1 equals c2 " + (c1 == c2))

    println("如果去掉data则没有此效果")
}