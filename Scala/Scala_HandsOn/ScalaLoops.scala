package hub.bigdata.scala

import scala.util.control.Breaks._

object ScalaLoops {
  def main(args: Array[String]): Unit = {
    var num = 0;
    while (num < 10 && num >= 0) {
      println(num)
      num = num + 1
    }
    do {
      println("Hai")
    } while (false)

    num = 0;
    while (num < 10 && num >= 0) {
      if (num % 5 == 0) {
        println(num)
        break
      }
      num = num + 1
    }

  }
}