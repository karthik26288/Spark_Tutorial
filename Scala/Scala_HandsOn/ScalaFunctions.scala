package hub.bigdata.scala

object ScalaFunctions {
  def main(args: Array[String]): Unit = {
  hai()
  hai("Welcome")
  println(add(10, 20))
  println(add(10,20, 30))
  println(add(10,20.10f, 30.34))
  welcomeMessage("python")
  welcomeMessage("scala")
  welcomeMessage("C")
  }

  def hai(){
    println("Hai")
  }
  
  def hai(message:String){
    println(message)
  }
  
  def add(a:Int, b:Int) : Int = {
    return a + b
  }
  
  def add(a:Int, b:Int, c:Int) : Int = {
    (a + b + c)
  }
  
  def add(a:Int, b:Float, c:Double) : Double = {
    (a + b + c)
  }
  
  def welcomeMessage(message:String) : Unit = message match {
    case "scala" => println("Hai Welcome to Scala World")
    case "java" => println("Hai Welcome to Java World")
    case "python" => println("Hai Welcome to Python World")
    case _ => println("Hai Welcome to Programming World")
  }
  
}