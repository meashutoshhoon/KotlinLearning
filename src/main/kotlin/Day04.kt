/**
 * Day04.kt
 * This program demonstrates the difference between Float and Double data types in Kotlin.
 *
 * - `Float` has lower precision and takes up less memory.
 * - `Double` provides higher precision but uses more memory.
 * - The program performs division using both Float and Double types to show precision differences.
 * - A homework function calculates the volume of a sphere using the Double type for better accuracy.
 */

fun main() {
    // Declaring float variables (lower precision, less memory usage)
    var x = 20.155165432156465F
    var y = 8F

    // Performing division using float values
    println("The result of x / y is: ${x / y}")

    // Declaring double variables (higher precision, more memory usage)
    var c = 20.155165432156465
    var d = 8

    // Performing division using double values
    println("The result of c / d is: ${c / d}")

    // Calling the function to calculate the volume of a sphere
    homeWork()
}

/**
 * Function to calculate the volume of a sphere.
 *
 * - Uses `Double` type for better precision.
 * - Formula: Volume = 0.75 * π * r³
 */
private fun homeWork() {
    val pi = 3.14
    val radius = 4.5

    // Calculating and printing the volume of the sphere
    println("The volume of the sphere with radius $radius is ${0.75 * pi * radius * radius * radius}")
}
