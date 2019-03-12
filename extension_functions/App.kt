package udacity.pair

fun main(args: Array<String>) {

    // Extension Functions
    val puppy = Puppy()
    val book2 = Book("test", "daniel", 1999)
    val book3 = Book("test2", "danielT", 1996)
    println(book3.getWeightOfBook())
    while (book3.pages > 0) {
        puppy.playWithBook(book3)
        println("${book3.pages} left in ${book3.title}")
    }
}

fun Book.getWeightOfBook(): Double {
    return pages * 1.5
}

fun Book.tornPages(numberOfTornPages: Int) = if (pages >= numberOfTornPages) pages -= numberOfTornPages else pages = 0
