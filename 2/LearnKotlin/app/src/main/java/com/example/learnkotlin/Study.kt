package com.example.learnkotlin

interface Study {
    fun readBooks()

    fun doHomework()
}

class Student7(name: String, age: Int) : Person3(name, age),
    Study {
    override fun readBooks() {
        println("$name is reading")
    }

    override fun doHomework() {
        println("$name is doing homework")
    }
}

fun main() {
    val s = Student7("Jack", 19)

    doStudy(s)

    println()

    doStudy2(Student8("Jack", 19))
}

fun doStudy(study: Study) {
    study.readBooks()

    study.doHomework()
}

fun doStudy2(study: Study2) {
    study.readBooks()

    study.doHomework()
}

interface Study2 {
    fun readBooks()

    fun doHomework() {
        println("默认实现")
    }
}

class Student8(name: String, age: Int) : Person3(name, age),
    Study2 {
    override fun readBooks() {
        println("$name is reading")
    }

}
