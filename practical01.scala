object Test{
    def main(args: Array[String]) = {
        // question 1
        def areaOfDisk(r: Int): Double = 3.14 * r * r

        val area = areaOfDisk(5)
        println(s"Area of a disk is: $area")

        // question 2
        def tempConversion(t: Int): Double = t * 1.8 + 32

        val temp = tempConversion(35)
        println(s"Temperature in Fahrenheit: $temp")

        // question 3
        def volumeOfSphere(r: Int): Double = (4.0 / 3.0) * 3.14 * r * r * r

        val volume = volumeOfSphere(5)
        println(s"Volume of the sphere is: $volume")

        // question 4
        def shippingCost(c: Int): Double = if (c <= 50) 3 * c else 150 + (c - 50) * 0.75
        def coverPrice(c: Int): Double = 24.95 * c

        val totalPrice = shippingCost(60) + coverPrice(60)
        println(s"Total wholesale cost: Rs. $totalPrice")

        // question 5
        def totalRunningTime(e: Int, t: Int): Double = e * 8 + t * 7

        val time = totalRunningTime(4, 3)
        println(s"Total running time: $time minutes")
    }
}
