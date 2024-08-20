object q3 extends App {
    def toUpper(input: String): String = {
        input.map(ch => if (ch >= 'a' && ch <= 'z') (ch - 32).toChar else ch)
    }

    def toLower(input: String): String = {
        input.map(ch => if (ch >= 'A' && ch <= 'Z') (ch + 32).toChar else ch)
    }

    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(str => toUpper(str.take(2)) + toLower(str.drop(2))))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(str => toLower(str.init) + toUpper(str.takeRight(1))))
    
}
