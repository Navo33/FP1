object q3 extends App {
  def formatNames(name: String)(format: String => String): String = format(name)

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  names.foreach {
    case "Benny" => println(formatNames("Benny")(_.toUpperCase))
    case "Niroshan" => println(formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2).toLowerCase))
    case "Saman" => println(formatNames("Saman")(_.toLowerCase))
    case "Kumara" => println(formatNames("Kumara")(name => name.head.toUpper + name.tail.init.toLowerCase + name.last.toUpper))
  }
}
