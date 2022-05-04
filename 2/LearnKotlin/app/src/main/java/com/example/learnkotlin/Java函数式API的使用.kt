package com.example.learnkotlin

fun main() {

    Thread(object : Runnable {
        override fun run() {
            println("形式1")
        }
    }).start()

    Thread(Runnable {
        println("形式2")
    }).start()

    Thread({
        println("形式3")
    }).start()

    Thread {
        println("形式4")
    }.start()
}