package hub.bigdata.scala

object LazyCompute {
  def main(args: Array[String]): Unit = {
    lazy val name = "Naga"
    lazy val age = 30
    println("Name is: " + name)
    println("Age: " + age)
  }
}