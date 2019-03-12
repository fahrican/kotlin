package udacity.pair

fun main(args: Array<String>) {

    val allBooks = setOf<String>("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks = mutableMapOf<String, String>(Pair("Hamlet", "Shakespeare"))
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)
}
