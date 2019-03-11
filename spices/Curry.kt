package udacity.oop.simpleSpice.spices

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun prepareSpice() {
        grind()
    }
}
