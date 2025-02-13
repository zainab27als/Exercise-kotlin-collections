fun main() {
    val numbers = listOf(10, 5, 20, 15, 25, 30)

    val greaterThan15 = numbers.filter { it > 15 }
    println("Numbers greater than 15: $greaterThan15")

    val sortedNumbers = numbers.sorted()
    println("Sorted List: $sortedNumbers")
}