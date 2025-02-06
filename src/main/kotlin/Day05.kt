/**
 * Day05.kt
 * This program demonstrates basic string manipulation in Kotlin.
 *
 * - `uppercase()` converts the string to uppercase.
 * - `lowercase()` converts the string to lowercase.
 * - `reversed()` reverses the string.
 * - String interpolation is used to embed expressions inside a string.
 */

fun main() {
    val string = "This is an example text"

    // Converts the string to uppercase and then back to lowercase
    println("Our string is: ${string.uppercase().lowercase()}")

    // Calls the homework function to demonstrate another string operation
    homeWork()
}

/**
 * Homework function:
 * - Stores a name in a variable.
 * - Converts the name to uppercase.
 * - Reverses the uppercase string and prints it.
 */
private fun homeWork() {
    val name = "Ashutosh"

    // Converts name to uppercase and then reverses it
    println("The reversed name in uppercase is: ${name.uppercase().reversed()}")
}
