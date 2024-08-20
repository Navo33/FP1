object q2 extends App {
  // lambda function
  val checkNumber: Int => String = num => num match {
    case n if n <= 0 => "Negative/Zero is input"
    case n if n % 2 == 0 => "Even number is given"
    case n if n % 2 != 0 => "Odd number is given"
  }

  println("Enter number: ")
  val num = scala.io.StdIn.readInt()
  println(checkNumber(num))
}
