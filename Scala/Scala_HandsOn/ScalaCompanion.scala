package hub.bigdata.scala

object ScalaCompanion {
  def main(args: Array[String]) {
    val hello = new ScalaCompanion()
    hello.message()
  }
}

class ScalaCompanion {
  def message() {
    println("Hello")
  }
}