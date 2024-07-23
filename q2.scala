import scala.io.StdIn._

object q2 extends App {
    def patternMatching(x: Int):Unit = x match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number")
        case _ => println("Odd number")
    }

    println("Input: ")
    val num = readInt()
    patternMatching(num)
}


