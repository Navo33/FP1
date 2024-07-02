object test extends App {

  //Q1
  def reverseString(input: String): String = {
    if (input.isEmpty) ""
    else reverseString(input.tail) + input.head
  }

  //Q2
  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  //Q3
  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 3.00
    "%.2f".format(mean).toDouble
  }

  //Q4
  def sumOfEven(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  val string1 = "String to be reversed"
  val string2 = reverseString(string1)
  println(s"\nInput String: $string1")
  println(s"Reversed String: $string2")

  val inputList = List ("name", "christiano", "awesome", "reversed", "rounded", "game")
  val filteredList = filterStrings(inputList)
  println(s"\ninput List: $inputList")
  println(s"Filtered List: $filteredList")

  val num1 = 10
  val num2 = 15
  val average = arithmeticMean(num1, num2)
  println(s"\nArithmetic Mean of $num1 and $num2: $average")

  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val sumOfEvens = sumOfEven(numbers)
  println(s"\nInput List: $numbers")
  println(s"Sum of Even Numbers: $sumOfEvens")
}
