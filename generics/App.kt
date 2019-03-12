package building

fun main() {

    val wood = Building(Wood())
    wood.build()
    val brick = Building(Brick())
    brick.build()
}
