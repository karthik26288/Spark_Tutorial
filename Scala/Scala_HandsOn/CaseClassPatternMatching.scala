package hub.bigdata.scala

object CaseClassPatternMatching {
  case class Email(from: String, to: String, message: String) extends Notify
  case class SMS(to: String, message: String) extends Notify
  case class Alert(message: String) extends Notify
  def sendNotification(notification: Notify): Unit = notification match {
    case Email(from, to, title) => println("You got a mail")
    case SMS(to, msg) => println("You got an SMS")
    case Alert(msg) => println("You got an Alert")
    case _ => println("No Event")
  }
  def main(args: Array[String]): Unit = {
    val email = Email("abc@gmail.com", "xyz@gmail.com", "HI How are you?")
    sendNotification(email)
  }
}