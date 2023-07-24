import kotlin.math.sqrt

/**
 * Solve the equation x^3+7x^2+10x = 0
 */
fun main(){
    // This program will solve the polynomial equation by finding its roots
    // f(x) = x^3+7x^2+10x = 0
    // Since f(-2) = -8+28-20 = 0, (x+2) is one of the roots
    // Dividing the polynomial by (x+2) gives us x^2+5x; Thus (x+2)(x^2+5x) = 0
    val root1 = -2
    // Solving the quadratic equation x^2+5x = 0; x = (-b+-sqrt(b^2-4ac))/2a
    val a = 1
    val b = 5
    val c = 0
    val x: String
    val y = ((b * b) - (4 * a * c)).toDouble()
    val root2 = (-b + sqrt(y)) / (2 * a)
    val root3 = (-b - sqrt(y)) / (2 * a)
    x = "x = $root1, x = ${root2.toInt()} and x = ${root3.toInt()}"
    print ("The roots of the equation are: $x")
}