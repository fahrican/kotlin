package udacity.higher_order_functions

class Game {

    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END)
        println("Game Over")
        println(path.joinToString { it -> "$it" })
        path.clear()
        false
    }
}
