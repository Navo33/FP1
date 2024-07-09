object q3 extends App {
  def toUpper(x: String): String = x.toUpperCase()

  def toLower(x: String): String = x.toLowerCase()

  def formatNames(name: String)(format: String => String): String = format(name)

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  names.foreach {
    case "Benny" => println(formatNames("Benny")(toUpper))
    case "Niroshan" => println(formatNames("Niroshan")(name => toUpper(name.take(2)) + toLower(name.drop(2))))
    case "Saman" => println(formatNames("Saman")(toLower))
    case "Kumara" => println(formatNames("Kumara")(name => toUpper(name.head.toString) + toLower(name.tail.init) + toUpper(name.last.toString)))
  }
}
