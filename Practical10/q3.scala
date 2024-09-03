class Account(var balance: Double) {
  def deposit(amount: Double): Unit = balance += amount

  def withdraw(amount: Double): Unit = {
    if (amount <= balance) balance -= amount
    else throw new Exception("Insufficient funds")
  }

  def transfer(amount: Double, to: Account): Unit = {
    this.withdraw(amount)
    to.deposit(amount)
  }

  override def toString: String = s"Balance: $$${balance}"
}

object q3 extends App {
  val acc1 = new Account(1000)
  val acc2 = new Account(500)

  println(s"Initial: acc1: $acc1, acc2: $acc2")

  acc1.deposit(300)
  println(s"Depositing 300 to acc1 : $acc1")

  acc1.withdraw(150)
  println(s"Withdrawing 150 from acc1 : $acc1")

  println(s"Transferring 200 from acc1 to acc2")
  acc1.transfer(200, acc2)

  println(s"Final: acc1 : $acc1, acc2 : $acc2")
}