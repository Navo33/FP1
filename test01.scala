object test extends App {
    // q1
    def areaOfDisk(r:Int):Double = 3.14 * r * r

    // q2
    def tempConversion(t:Int):Double = t * 1.8 + 32

    // q3
    def volumeOfSphere(r:Int):Double = 4 / 3 * 3.14 * r * r * r

    // q4
    def shippingCost(c:Int):Double = if(c <= 50) 3 * c else 150 + (c - 50) * 3.75
    def coverPrice(c:Int):Double = 24.95 * c
    def price(c:Int):Double = (shippingCost(c) + coverPrice(c)) * 40/100

    // q5
    def totalRunningTime(e:Int, t:Int): Double = e * 8 + t * 7


    val area = areaOfDisk(5)
    println(s"Area of a disk: $area")

    val temp = tempConversion(35)
    println(s"Temp in Fahrenheit: $temp")

    val volume = volumeOfSphere(5)
    println(s"Volume of sphere: $volume")

    val totalPrice = price(60)
    println(s"Total cost: Rs.$totalPrice")

    val time = totalRunningTime(4, 3)
    println(s"Total run time: $time minutes")
    
}
