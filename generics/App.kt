package building

fun main() {

    val wood = Building(Wood())
    wood.build()
    val brick = Building(Brick())
    brick.build()
    
    isSmallBuilding(Building(Wood()))
    isSmallBuilding(Building(Brick()))
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
