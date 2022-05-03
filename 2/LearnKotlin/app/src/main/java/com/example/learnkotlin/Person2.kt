package com.example.learnkotlin

//kotlin中非抽象类默认是不能被继承的，相当于java中加上了final
//open表示该类专门为继承而设计
open class Person2 {
    var name = ""
    var age = 0

    fun eat() {
        println("$name is eating age $age")
    }
}

//Student继承Person2
class Student : Person2() {
    var sno = ""
    var grade = 0
}