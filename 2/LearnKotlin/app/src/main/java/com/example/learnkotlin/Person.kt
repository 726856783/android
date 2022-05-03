package com.example.learnkotlin

class Person {
    var name = ""
    var age = 0

    fun eat() {
        println("$name is eating age $age")
    }
}

fun main() {
    val p = Person()

    p.name = "Jack"
    p.age = 5

    p.eat()
}