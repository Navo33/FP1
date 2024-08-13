object q2 extends App {

    print("Enter a number: ")
    val number = scala.io.StdIn.readInt()

    val isMultipleOfThree = (n: Int) => n % 3 == 0
    val isMultipleOfFive = (n: Int) => n % 5 == 0

    val result = (isMultipleOfThree(number), isMultipleOfFive(number)) match {
      case (true, true) => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(result)
}
