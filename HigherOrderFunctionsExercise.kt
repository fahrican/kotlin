package udacity.higher_order_functions

fun main(args: Array<String>) {

    /*
    Create an extension on 'List' using a higher order function that returns all the numbers in the list that are divisible by 3.
    Start by creating an extension function on List that takes an lambda on Int and applies it to each item in the list.
    When the lambda returns zero, include the item in the output. For example, this list:
     */
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy { it.rem(3) })
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {

    val result = mutableListOf<Int>()
    
    this.forEach { it -> if (block(it) == 0) result.add(it) }
    
    return result
}
