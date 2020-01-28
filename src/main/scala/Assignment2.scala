object Assignment2 {
  val days = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

  def task1(day: String): String = day match {
    case d if days.map(_.toLowerCase()).filter(!_.startsWith("s")).contains(d.toLowerCase()) => "Work"
    case d if days.map(_.toLowerCase()).filter(_.startsWith("s")).contains(d.toLowerCase()) => "Weekend"
    case _ => "No such day"
  }

  def task4(f: Int => Int, a: Int): Int = f(f(f(a)))

  def main(args: Array[String]): Unit = {
    println("1:")
    println(task1("Sunday"))
    println(task1("Thursday"))
    println(task1("Another day"))

    println("2:")
    val b: BankAccount = new BankAccount()
    b.currentBalance
    b.deposits(3000000)
    b.currentBalance
    b.withdraw(1000)
    b.currentBalance
    new BankAccount(1000).currentBalance

    println("3:")
    val somebody: PersonTask3 = PersonTask3("Somebody", "Typical")
    somebody.greeting(PersonTask3("Pietia", "PJATK"))
    somebody.greeting(PersonTask3("Tomasz", "Pieciukiewicz"))
    somebody.greeting(PersonTask3("Cara", "Delevigne"))

    println("4:" + task4(x => x * x, 2))

    println("5:")
    object p1 extends PersonTask5("Mateusz", "Kowalski") with Employee
    p1.salary_(300)
    p1.taxToPay
    object p2 extends PersonTask5("Ivan", "Ololojev") with Student
    p2.taxToPay
    object p3 extends PersonTask5("Agata", "Serek") with Teacher
    p3.salary_(1000)
    p3.taxToPay
    object p4 extends PersonTask5("Ania", "Ololojeva") with Employee with Student
    p4.salary_(2000)
    p4.taxToPay
    object p5 extends PersonTask5("Petro", "Svynota") with Student with Employee
    p5.salary_(1000000)
    p5.taxToPay
  }
}
