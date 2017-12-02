## Scala Classes:
* Scala class is blue print/template for scala Object
* Scala Object is instance of class.
* Scala Objects are created from Scala class using "new" operator
* Scala class contins state (data member) and behavior (Member function)
* In Scala Class, we have fields and methods

Class Example
```
class Employee(name:String, age:Int, role:String) {
  val this.name = name
  val this.age = age
  val this.role = role
  def getName() : String = {
    return name
  }
  def getAge() : Int = {
    (age)
  }
  def getRole(): String = {
    (role)
  }
}
