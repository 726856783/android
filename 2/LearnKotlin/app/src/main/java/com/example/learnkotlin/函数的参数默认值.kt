package com.example.learnkotlin

fun main() {
    printParams(12)

    println()

    println("这种不行")
    //printParams2("hello")

    println()

    println("可以通过键值对的方式来传参")
    printParams2(str = "hello")

}

fun printParams(num: Int, str: String = "hello") {
    println("num is $num , str is $str")
}

fun printParams2(num: Int = 100, str: String) {
    println("num is $num , str is $str")
}

class Student9(val sno: String, val grade: Int, name: String, age: Int) : Person3(name, age) {
    //次构造函数
    constructor(name: String, age: Int) : this("", 0, name, age) {
    }

    constructor() : this("", 0) {

    }
}

//给主构造函数设定默认值
class Student10(val sno: String = "", val grade: Int = 0, name: String = "", age: Int = 0) :
    Person3(name, age) {
}