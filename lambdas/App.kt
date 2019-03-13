package udacity.higher_order_functions

fun main(args: Array<String>) {

    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)

}
