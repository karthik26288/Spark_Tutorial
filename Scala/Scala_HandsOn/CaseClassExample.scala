package hub.bigdata.scala

object PersonExample {
  case class Person(name: String, age: Int)

  def main(args: Array[String]) {
    val person = Person("Naga", 30)
    println(person.name)
    println(person.age)
  }
}
