object q2 extends App {

  print("Enter a number: ")
  val number = scala.io.StdIn.readInt()

  val result = number match {
    case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
    case n if n % 3 == 0 => "Multiple of Three"
    case n if n % 5 == 0 => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }

  println(result)
}
