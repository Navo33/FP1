class Rational(n: Int, d: Int) {
  require(d != 0, "Cannot be zero")

  private val gcdval = gcd(n.abs, d.abs)
  val num: Int = n / gcdval
  val den: Int = d / gcdval

  def this(n: Int) = this(n, 1)

  def sub(that: Rational): Rational = {
    new Rational(
      num * that.den - that.num * den,
      den * that.den
    )
  }

  override def toString: String = s"$num/$den"

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

object q2 extends App {
  val x = new Rational(3, 4)  // 3/4
  val y = new Rational(5, 8)  // 5/8
  val z = new Rational(2, 7)  // 2/7

  val result = x.sub(y).sub(z)

  println(s"Result of x - y - z: $result")
}
