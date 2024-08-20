object q1 extends App {
  // lambda function
  val interest: Double => Double = deposit => deposit match {
    case d if d <= 20000    => d * 0.02
    case d if d <= 200000   => d * 0.04
    case d if d <= 2000000  => d * 0.035
    case d if d > 2000000   => d * 0.065
  }


  println("Rs. 15000 intrest: " + interest(15000)) 
  println("Rs. 150000 intrest: " + interest(150000)) 
  println("Rs. 250000 intrest: " + interest(250000))
  println("Rs. 5000000 intrest: " + interest(5000000))
}
