object q3 extends App {
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num > 1 && !(2 to Math.sqrt(num.toDouble).toInt).exists(i => num % i == 0)
    )
  }

  val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val primeNumbers = filterPrime(inputList)
  
  println("Prime numbers: " + primeNumbers.mkString(", "))
}
