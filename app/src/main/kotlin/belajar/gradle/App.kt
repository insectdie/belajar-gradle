/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package belajar.gradle

import com.google.gson.Gson

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)

    val gson = Gson()
}
