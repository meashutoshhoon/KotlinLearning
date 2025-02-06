/**
 * Day03.kt
 * This file covers the basics of arithmetic operators and shorthand assignment operators in Kotlin.
 *
 * Concepts Learned:
 * 1. Using arithmetic operators (`+`, `-`, `*`, `/`) for basic calculations.
 * 2. Using shorthand assignment operators (`+=`, `-=`, `*=`, `/=`) to update variable values.
 * 3. Homework: Storing three numbers in variables and performing calculations.
 */

fun main() {
    var x = 15
    var y = 7

    // Addition
    val result = x + y
    println("The result is $result")

    // Subtraction
    println(x - y)

    // Shorthand assignment operators
    x += 10
    y -= 10

    // Multiplication
    println(x * y)

    // Division
    println(x / y)

    // Call homework function
    homeWork()
}

/**
 * Homework function to demonstrate storing three numbers and performing calculations.
 */
private fun homeWork() {
    val x = 3
    val y = 4
    val z = 5

    println("x : $x")
    println("x + y : ${x + y}")
    println("x + y + z : ${x + y + z}")
}