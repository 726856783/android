package com.example.learnkotlin

//主构造函数
class Student2(val sno: String, val grade: Int) {
    init {
        println("init 是主构造函数的结构体")

        println("sno is $sno")

        println("grade is $grade")
    }
}

fun main() {
    val student = Student2("a1", 5)

    val student2 = Student4("a1", 5, "Jack", 1)

    val s1 = Student5()
    val s2 = Student5("Jack", 19)
    val s3 = Student5("a1", 5, "Jack", 1)
}

//Person2后的括号表示调用父类构造函数
class Student3(val sno: String, val grade: Int) : Person2() {
}

open class Person3(val name: String, val age: Int) {
    fun eat() {
        println("$name is eating age $age")
    }
}

class Student4(val sno: String, val grade: Int, name: String, age: Int) : Person3(name, age) {
}

class Student5(val sno: String, val grade: Int, name: String, age: Int) : Person3(name, age) {
    //次构造函数
    constructor(name: String, age: Int) : this("", 0, name, age) {
        println("一个类可以有一个主构造函数和多个次构造函数")
    }

    constructor() : this("", 0) {

    }
}

class Student6 : Person3 {
    constructor(name: String, age: Int) : super(name, age) {
        println("只有次构造函数，没有主构造函数")
    }
}