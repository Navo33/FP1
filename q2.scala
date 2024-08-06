object q2 extends App {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  val inputList = List(1, 2, 3, 4, 5)
  val squared = calculateSquare(inputList)
  
  println("Squared numbers: " + squared.mkString(", "))
}
