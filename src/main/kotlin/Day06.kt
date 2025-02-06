/**
 * Day06.kt
 * This program demonstrates logical and comparison operators in Kotlin.
 *
 * Comparison Operators:
 * - `==`  : Checks if two values are equal.
 * - `!=`  : Checks if two values are not equal.
 * - `<`   : Checks if the left value is less than the right value.
 * - `>`   : Checks if the left value is greater than the right value.
 * - `<=`  : Checks if the left value is less than or equal to the right value.
 * - `>=`  : Checks if the left value is greater than or equal to the right value.
 *
 * Logical Operators:
 * - `&&`  : Logical AND (returns true if both conditions are true).
 * - `||`  : Logical OR (returns true if at least one condition is true).
 * - `!`   : Logical NOT (negates a boolean value).
 */

fun main() {
    var x = 4
    val y = 5

    // Comparison operators
    println(x == y)  // false: x is not equal to y
    println(x < y)   // true: x is less than y
    println(x <= y)  // true: x is less than or equal to y
    println(x >= y)  // false: x is not greater than or equal to y
    println(x != y)  // true: x is not equal to y

    // Logical operators
    val a = 6
    val b = 10
    x = 5

    println(x == y && a == b)  // false: both conditions are not true
    println(x == y || a == b)  // false: neither condition is true

    println(!(x == y) || a == b)  // true: NOT operation applied to first condition

    println(!(x == y || a == b && a > y))  // true: combination of NOT, OR, and AND
}
