package hub.bigdata.scala

object PatternMatching {
  def main(args: Array[String]): Unit = {
    val city = "Mysore"
    city match {
      case "Bangalore" => println("It is capital city of Karnataka")
      case "Chennai" => println("It is capital city of Tamilnadu")
      case "Hyderabad" => println("It is capital city of Telangana")
      case "Mumbai" => println("It is capital city of Maharastra")
      case _ => println("It is not a capital city")
    }
    
     val state:Any = 1
    state match {
      case "Bangalore" => println("It is capital city of Karnataka")
      case "Chennai" => println("It is capital city of Tamilnadu")
      case "Hyderabad" => println("It is capital city of Telangana")
      case "Mumbai" => println("It is capital city of Maharastra")
      case 1 => println("It is Andhra Pradesh")
      case 2 => println("It is Arunachal Pradesh")
      case _ => println("It is not a capital city")
    }
  }
}