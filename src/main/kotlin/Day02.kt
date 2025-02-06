/**
 * Day02.kt
 * This file covers the basics of variables, mutability, and naming conventions in Kotlin.
 *
 * Concepts Learned:
 * 1. Difference between `var` (mutable) and `val` (immutable) variables.
 * 2. Using camel case for variable names (e.g., `myVariable`, `myNewVariable`).
 * 3. Declaring and updating boolean variables.
 * 4. Homework: Storing age and favorite number in variables and printing them.
 */

fun main() {
    // Declare a mutable variable `myVariable` and update its value
    var myVariable = 3
    println("The value of myVariable is: $myVariable")
    myVariable = 4
    println("The value is now: $myVariable")

    // Declare an immutable variable `myNewVariable`
    val myNewVariable = 5
    println("The value of myNewVariable is: $myNewVariable")

    // Declare and update a boolean variable
    var myBoolean = true
    println("The value of myBoolean is: $myBoolean")
    myBoolean = false
    println("The value is now: $myBoolean")

    // Homework function
    homeWork()
}

/**
 * Homework function to demonstrate storing and printing personal details.
 */
private fun homeWork() {
    val age = 19
    val favouriteNumber = 404
    println("My age is $age")
    println("My favourite number is $favouriteNumber")
}