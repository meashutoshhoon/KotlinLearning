/**
 *  Day07.kt
 * This program demonstrates conditional statements (`if`, `else if`, and `else`) in Kotlin.
 *
 * Key Concepts:
 * - If a condition contains only one statement, `{}` braces are optional.
 * - The `if` statement can return a value when used as an expression.
 * - The `else if` statement is used when there are multiple conditions.
 * - The `else` statement runs when none of the previous conditions are met.
 */

fun main() {
    var x = 5
    val y = 7

    // Using `if` as an expression to assign a value to `z`
    val z = if (x + y == 14) 3 else 4

    // Checking conditions using if-else
    if (x < y || y * y == 49)
        println("At least one of the conditions is true.")
    else if (x > y)
        println("x is greater than y.")
    else
        println("x must equal y.")

    println("This will always run.")
    println("z is $z")

    // Another set of if-else conditions
    x = 8
    if (x < y) {
        println("x is less than y.")
    } else if (x > y) {
        println("x is greater than y.")
    } else {
        println("x must equal y.")
    }
    println("This will always run 2.")

    x = 7
    if (x < y) {
        println("x is less than y.")
    } else if (x > y) {
        println("x is greater than y.")
    } else {
        println("x must equal y.")
    }
    println("This will always run 3.")

    // Calling the homework function
    homeWork()
}

/**
 * Homework: Checking if a given string is a palindrome.
 * - A palindrome is a word that reads the same forward and backward.
 * - We compare the original string with its reversed version.
 */
private fun homeWork() {
    val string = "racecar"

    if (string == string.reversed())
        println("The string is a palindrome.")
    else
        println("The string is not a palindrome.")
}
