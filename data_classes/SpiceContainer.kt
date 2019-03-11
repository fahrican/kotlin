package udacity.data_classes

import udacity.oop.simpleSpice.spices.Spice

data class SpiceContainer(val spice: Spice){

    val label: String = spice.name
}
