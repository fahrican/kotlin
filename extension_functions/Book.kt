package udacity.pair

class Book(val title: String, val author: String, val year: Int) {

    companion object {
        const val MAX_NUMBER_BOOKS = 10
        val BASE_URL = "http://www.turtlecare.net/"
    }

    var pages = 200

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAndAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(borrowedBooks: Int): Boolean {
        return (borrowedBooks <= MAX_NUMBER_BOOKS)
    }

    fun printUrl(){
        println("${Constants.BASE_URL}$title.html")
    }
}
