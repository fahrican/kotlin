package udacity.oop.simpleSpice.spices

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    abstract fun prepareSpice()
}
