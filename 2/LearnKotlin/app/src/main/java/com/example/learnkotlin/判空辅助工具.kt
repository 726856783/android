package com.example.learnkotlin

fun main() {

    doStudy4(null)
}

fun doStudy4(study: Study?) {
    println("变量后的问号表示如果为空则不执行后面的操作")

    study?.readBooks()

    study?.doHomework()
}

fun getTextLength(text: String?): Int {
    if (text != null) {
        return text.length
    }
    return 0
}

fun getTextLength2(text: String?) = text?.length ?: 0

var content: String? = "heelo"

fun printUpperCase() {
    println("两个感叹号表示确定变量不为空，不用编译检查")

    val upperCase = content!!.toUpperCase()

    println(upperCase)
}

fun doStudy5(study: Study?) {
    println("不为空时调用let")

    study?.let { s ->
        s.readBooks()

        s.doHomework()
    }

    study?.let {
        it.readBooks()

        it.doHomework()
    }
}