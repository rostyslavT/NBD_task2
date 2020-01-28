class BankAccount(private var balance: Double) {

  def this() {
    this(0)
    println("No initial balance given, set to 0")
  }

  def deposits(amount: Double): Unit = {
    if (amount > 0) balance = balance + amount
    else throw new Exception("Wrong amount")
  }

  def withdraw(amount: Double): Unit = {
    if (0 < amount && amount <= balance) {
      balance = balance - amount
    } else throw new Exception("Wrong amount")
  }

  def currentBalance: Unit = {
    println("Current balance is " + balance + "$")
  }
}