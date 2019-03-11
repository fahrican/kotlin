package udacity.oop.simpleSpice.spices

fun main(args: Array<String>) {

    delegate()
}

private fun delegate() {
    val spiceColor = YellowSpiceColor
    val curry = Curry("curry", "very spicy", spiceColor)
    println("Curry color is ${curry.color}.")
}
