package com.example.learnkotlin

fun main() {

    println("默认参数不可为空")
    //doStudy2(null)

    println()

    doStudy3(null)
}

fun doStudy2(study: Study) {
    study.readBooks()

    study.doHomework()
}

fun doStudy3(study: Study?) {
    println("类型后加问号表示可为空")
    println("编译时会检查，可为空的变量是否已判断")

    if (study != null) {

        study.readBooks()

        study.doHomework()

    }
}