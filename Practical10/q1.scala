class Rational(n: Int, d: Int) {

    require(d != 0, "Cannot be zero")

    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }

    private val gcdval = gcd(n.abs, d.abs)
    val num: Int = n / gcdval
    val den: Int = d / gcdval

    def this(n: Int) = this(n, 1)

    def neg: Rational = new Rational(-num, den)

    override def toString: String = s"$num/$den"

  
}

object q1 extends App{

    val r1 = new Rational(12, 56) 
    val negR1 = r1.neg
    println(s"Original: $r1, Negated: $negR1")

}
