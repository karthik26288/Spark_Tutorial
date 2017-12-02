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

Object Example:

object Emp {
  def main(args:Array[String]) : Unit = {
    val emp = new Employee("Naga", 30, "Architect")
    println(emp.getName)
    println(emp.getAge)
    println(emp.getRole)
  }
}

Extending Classes:

class Manager(name:String, age:Int, role:String, team:String) extends Employee(name:String, age:Int, role:String){
    val this.team = team
    def getTeam() : String = {
        return team
    }
}

object Emp {
  def main(args:Array[String]) : Unit = {
    val emp = new Manager("Naga", 30, "Architect", "Hadoop")
    println(emp.getName)
    println(emp.getAge)
    println(emp.getRole)
    println(emp.getTeam)
  }
}

'''
## Singleton Objects:
* Scala is pure Object Oriented and there are no static members.
* Scala has Singleton objects instead of static memners.
* Singleton is class that can have only one instance of Object.
* We create singleton using the keyword object instead of class keyword.
* There is no instantiation and there is no parameters passing to constructor.
```
Example:
object Hello {
  def main(args:Array[String]){
    println("Hai")
  }
}
```
