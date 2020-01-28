trait Teacher extends Employee {
  override def taxToPay: Unit = println("You are not such lucky as students are, but still lucky, taxes to pay: "
    + salary * 0.1)
}