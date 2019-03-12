package building

class Building<T: BaseBuildingMaterial>(val baseBuildingMaterial: T) {

    private val baseMaterialsNeeded = 100
    private val actualMaterialsNeeded = baseMaterialsNeeded * baseBuildingMaterial.numberNeeded

    fun build(){
        val material = baseBuildingMaterial::class.simpleName
        println("$actualMaterialsNeeded $material is required")
    }
}
