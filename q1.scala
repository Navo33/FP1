object q1 extends App{

    var itemName: Array[String] = Array("Apple", "Banana", "Orange")
    var itemQuantity: Array[Int] = Array(10, 20, 15)

    def displayInventory(): Unit = {
        println("Inventory:")
        for (i <- itemName.indices){
        println(s"${itemName(i)}: ${itemQuantity(i)}")
        }
    }

    def restockItem(itemName: String, quantity: Int): Unit ={
        val index = itemName.indexOf(itemName)
        if (index >= 0){
        itemQuantity(index) += quantity
        println(s"Restocked $itemName with  $quantity")
        } 
        else {
        println(s"Item $itemName does not exist.")
        }
    }

    def sellItem(itemName: String, quantity: Int): Unit = {
        val index = itemName.indexOf(itemName)
        if (index >= 0){
        if (itemQuantity(index) >= quantity){
            itemQuantity(index) -= quantity
            println(s"Sold $quantity of $itemName")
        } 
        else {
            println(s"Not enough quantity to sell")
        }
        } 
        else {
        println(s"Item $itemName does not exist")
        }
    }

    displayInventory()
    restockItem("Apple", 5)
    sellItem("Banana", 25)
    sellItem("Orange", 10)
    displayInventory()
    
}
