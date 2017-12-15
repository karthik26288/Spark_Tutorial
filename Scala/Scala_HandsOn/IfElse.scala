package hub.bigdata.scala

object IfElse {
  def main(args: Array[String]): Unit = {
    val age = 30
    if(age > 21){
      println("You are allowed to Vote!")
    }else{
      println("Your are not allowed to Vote!")
    }
  }
}