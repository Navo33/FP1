import scala.collection.mutable
import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object q2 extends App {
    
  var library: mutable.Set[Book] = mutable.Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "2345678901"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "3456789012")
  )

  def addBook(book: Book): Unit = {
    if (!library.exists(_.isbn == book.isbn)) {
      library += book
      println(s"Book '${book.title}' added.")
    } else {
      println(s"Book with ISBN '${book.isbn}' already exists.")
    }
  }

  def removeBook(isbn: String): Unit = {
    val bookToRemove = library.find(_.isbn == isbn)
    bookToRemove match {
      case Some(book) =>
        library -= book
        println(s"Book '${book.title}' removed.")
      case None =>
        println(s"No book found with ISBN '$isbn'.")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Library Collection:")
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def searchBookByTitle(title: String): Unit = {
    val book = library.find(_.title.equalsIgnoreCase(title))
    book match {
      case Some(b) =>
        println(s"Book found: Title: ${b.title}, Author: ${b.author}, ISBN: ${b.isbn}")
      case None =>
        println(s"No book found with title '$title'.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"No books found by author '$author'.")
    }
  }

  // Example usage
  displayLibrary()
  addBook(Book("Brave New World", "Aldous Huxley", "4567890123"))
  removeBook("2345678901")
  println(s"Is book with ISBN '1234567890' in the library? ${isBookInLibrary("1234567890")}")
  searchBookByTitle("1984")
  displayBooksByAuthor("George Orwell")
  displayLibrary()
}
