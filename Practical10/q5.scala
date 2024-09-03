object q5 extends App {
    
  def countLetters(words: List[String]): Int = {
    words.map(_.length).reduce(_ + _)
  }

  val words = List("apple", "banana", "cherry", "date")
  val total = countLetters(words)
  println(s"Total count of letter occurrences: $total")
}
