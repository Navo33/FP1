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

class Bank(val accounts: List[Account]) {
  def negativeBalances: List[Account] = accounts.filter(_.balance < 0)

  def totalBalance: Double = accounts.map(_.balance).sum

  def applyInterest(): Unit = {
    accounts.foreach { acc =>
      if (acc.balance > 0) {
        acc.deposit(acc.balance * 0.05)
      } else {
        val overdraftInterest = acc.balance.abs * 0.1
        acc.balance -= overdraftInterest
      }
    }
  }
}

object BankApp extends App {
  val acc1 = new Account(1000)
  val acc2 = new Account(-200)
  val acc3 = new Account(300)
  val acc4 = new Account(-50)

  val bank = new Bank(List(acc1, acc2, acc3, acc4))

  println("Accounts with negative balances:")
  bank.negativeBalances.foreach(acc => println(acc))

  println(s"Total balance of all accounts: ${bank.totalBalance}")

  bank.applyInterest()
  println("Balances after applying interest:")
  bank.accounts.foreach(acc => println(acc))
}
