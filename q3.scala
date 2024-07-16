import scala.io.StdIn.readInt

object q3 extends App {

  def fibonacci(n: Int): List[Int] = {
    if (n == 1) {
      List(0)
    } 
    else if (n == 2) {
      List(0, 1)
    } 
    else {
      val list = fibonacci(n - 1)
      list :+ (list(list.size - 1) + list(list.size - 2))
    }
  }

  println("Enter the number of Fibonacci numbers to print:")
  val n = readInt()
  val fibList = fibonacci(n)
  println("List: ")
  fibList.foreach(println)
}
