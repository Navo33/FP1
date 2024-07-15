import scala.io.StdIn.readLine
object q1 extends App {
    
    def getProductList(): List[String] = {
        var products = List[String]()
        var productName = ""

        println("Enter products :")

        do {
            productName = readLine()
            if (productName != "done"){
                products = products:+ productName
            }
        } while(productName != "done")

        products

    }

    def printProductList(products: List[String]): Unit = {
        println("List of products: ")
        for (i <- products.indices){
            println(s"${i+1}. ${products(i)}")
        }
    }

    def getTotalProducts(products: List[String]): Int = {
        products.length
    }

    var productList = getProductList()
    printProductList(productList)
    var totalProducts = getTotalProducts(productList)
    println(s"Total Number of products $totalProducts")
    
}
