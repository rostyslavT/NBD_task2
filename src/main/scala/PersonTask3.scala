case class PersonTask3(var firstName: String, var lastName: String) {
  def greeting(person: PersonTask3): Unit = person match {
    case PersonTask3("Pietia", _) => println("Hi, Pietia :)")
    case PersonTask3(_, "Pieciukiewicz") => println("Good evening, Mr. Pieciukiewicz")
    case PersonTask3(name, surname) => println(s"Hello, $name $surname")
  }
}