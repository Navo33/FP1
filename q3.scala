import scala.io.StdIn.readLine

object q3 extends App {

  def fibonacci(n: Int): Unit = {
    
    for (i <- 0 until n) {
      println(fib(i))
    }

    def fib(n: Int): Int = {
      if (n <= 1) {
        n
      } else {
        fib(n - 1) + fib(n - 2)
      }
    }
  }

  println("Enter the number of Fibonacci numbers to print:")
  val n = scala.io.StdIn.readInt()
  fibonacci(n)
}
