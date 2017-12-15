

```scala211
 println("Hello World")
```

    Hello World



```scala211
lazy val name = "Naga"
```




    [36mname[39m: [32mString[39m = [32m<lazy>[39m




```scala211
name
```




    [36mres2[39m: [32mString[39m = [32m"Naga"[39m




```scala211
// Scala Variables
val name = "Naga"
var age = 30
println(name)
println(age)
age = 40
println(age)
//name = "Ravi"
println(name)
```

    Naga
    30
    40
    Naga





    [36mname[39m: [32mString[39m = [32m"Naga"[39m
    [36mage[39m: [32mInt[39m = [32m40[39m




```scala211
/*
Scala control structures
*/
val age = 24
if( age < 21){
    println("Not allowed to vote")
}else{
    println("Allowed to Vote")
}

// Pattern Matching....
 val city = "Mysore"
    city match {
      case "Bangalore" => println("It is capital city of Karnataka")
      case "Chennai" => println("It is capital city of Tamilnadu")
      case "Hyderabad" => println("It is capital city of Telangana")
      case "Mumbai" => println("It is capital city of Maharastra")
      case _ => println("It is not a capital city")
    }
```

    Allowed to Vote
    It is not a capital city





    [36mage[39m: [32mInt[39m = [32m24[39m
    [36mcity[39m: [32mString[39m = [32m"Mysore"[39m




```scala211
//Loops
  var num = 0;
    while (num < 10 && num >= 0) {
      println(num)
      num = num + 1
    }
```

    0
    1
    2
    3
    4
    5
    6
    7
    8
    9





    [36mnum[39m: [32mInt[39m = [32m10[39m




```scala211
//For Loop
for(i <- 1 to 10){
    println(i)
}

for (i <- 1 until 10){
    println(i)
}

val nums = for(i <- 1 to 10) yield i

for(num <- nums){
    println(num)
}
```

    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    1
    2
    3
    4
    5
    6
    7
    8
    9
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10





    [36mnums[39m: [32mcollection[39m.[32mimmutable[39m.[32mIndexedSeq[39m[[32mInt[39m] = [33mVector[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m, [32m10[39m)




```scala211
for(i <- 1 to 10 if i % 2 == 0){
    println(i)
}
```

    2
    4
    6
    8
    10



```scala211
for(i <- 1 to 10 by 3){
    println(i)
}
```

    1
    4
    7
    10



```scala211
//Scala Functions
def fact(n:Int) : Int = {
    if(n <= 1){
        return 1
    }else{
        return n * fact(n - 1)
    }
}

val factorial = fact(6)
```




    defined [32mfunction[39m [36mfact[39m
    [36mfactorial[39m: [32mInt[39m = [32m720[39m




```scala211
val x = (a:Int) => a + 10
```




    [36mx[39m: [32mInt[39m => [32mInt[39m = <function1>




```scala211
x(10)
```




    [36mres17[39m: [32mInt[39m = [32m20[39m




```scala211
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
```




    defined [32mfunction[39m [36mhai[39m
    defined [32mfunction[39m [36mhai[39m
    defined [32mfunction[39m [36madd[39m
    defined [32mfunction[39m [36madd[39m
    defined [32mfunction[39m [36madd[39m
    defined [32mfunction[39m [36mwelcomeMessage[39m




```scala211
hai()
hai("Welcome")
println(add(10, 20))
println(add(10,20, 30))
println(add(10,20.10f, 30.34))
welcomeMessage("python")
welcomeMessage("scala")
welcomeMessage("C")
```

    Hai
    Welcome
    30
    60
    60.44000038146973
    Hai Welcome to Python World
    Hai Welcome to Scala World
    Hai Welcome to Programming World



```scala211
//With default values
def add(a:Int = 10, b:Int = 20) : Int = {
    (a + b)
}
```




    defined [32mfunction[39m [36madd[39m




```scala211
add()
```




    [36mres21[39m: [32mInt[39m = [32m30[39m




```scala211
add(b=30, a=40)
```




    [36mres22[39m: [32mInt[39m = [32m70[39m




```scala211
//Scala Higher Order Functions
def subAndAdd(a:Int, b:Int, f:(Int, Int) => Int) : Int = {
    val sum = f(a, b)
    val sub = b - a
    val total = sum + sub
    (total)
}
val total = subAndAdd(30, 40, add)
```




    defined [32mfunction[39m [36msubAndAdd[39m
    [36mtotal[39m: [32mInt[39m = [32m80[39m




```scala211
val sum = (a:Int,b:Int) => (a + b)
sum(10, 20)
```




    [36msum[39m: ([32mInt[39m, [32mInt[39m) => [32mInt[39m = <function2>
    [36mres26_1[39m: [32mInt[39m = [32m30[39m




```scala211
val sum = (_:Int) + (_:Int)
sum(20, 30)
```




    [36msum[39m: ([32mInt[39m, [32mInt[39m) => [32mInt[39m = <function2>
    [36mres27_1[39m: [32mInt[39m = [32m50[39m




```scala211
def add(a:Int, b:Int) : Int = {
    (a
    +b)
}
val sum = add(40, 40)
```




    defined [32mfunction[39m [36madd[39m
    [36msum[39m: [32mInt[39m = [32m80[39m




```scala211
//Scala Currying...
def add(a:Int)(b:Int) = {
    (a + b)
}
val sum = add(10)(30)
```




    defined [32mfunction[39m [36madd[39m
    [36msum[39m: [32mInt[39m = [32m40[39m




```scala211
val adding = add(10)_
```




    [36madding[39m: [32mInt[39m => [32mInt[39m = <function1>




```scala211
val sum = adding(40)
```




    [36msum[39m: [32mInt[39m = [32m50[39m




```scala211
//Scala Functions with variable lenth parameters
def add(nums:Int*): Int = {
    var sum = 0;
    for(i <- nums){
        sum = sum + i
    }
    (sum)
}
val sum = add(1,2,3,4,5,6,7,8,9,10)
```




    defined [32mfunction[39m [36madd[39m
    [36msum[39m: [32mInt[39m = [32m55[39m




```scala211
abstract class Notify
case class Email(from:String, to:String, message:String) extends Notify
case class SMS(to:String, message:String) extends Notify
case class Alert(message:String) extends Notify

def sendNotification(notification:Notify) : Unit = notification match{
    case Email(from, to, title) => println("You got a mail")
    case SMS(to, msg) => println("You got an SMS")
    case Alert(msg) => println("You got an Alert")
    case _ => println("No Event")
}


```




    defined [32mclass[39m [36mNotify[39m
    defined [32mclass[39m [36mEmail[39m
    defined [32mclass[39m [36mSMS[39m
    defined [32mclass[39m [36mAlert[39m
    defined [32mfunction[39m [36msendNotification[39m




```scala211
val email = Email("abc@gmail.com", "xyz@gmail.com", "HI How are you?")
```




    [36memail[39m: [32mEmail[39m = [33mEmail[39m([32m"abc@gmail.com"[39m, [32m"xyz@gmail.com"[39m, [32m"HI How are you?"[39m)




```scala211
sendNotification(email)
```

    You got a mail



```scala211
//Scala Class constructors

class Employee {
    println("Employee")
}

val emp = new Employee()
```

    Employee





    defined [32mclass[39m [36mEmployee[39m
    [36memp[39m: [32mEmployee[39m = $sess.cmd37Wrapper$Helper$Employee@42187502




```scala211
class Employee(name:String, age:Int){
 def getName(): String = {
  (name)
 }
 def getAge(): Int = {
  (age)
 }
}
```




    defined [32mclass[39m [36mEmployee[39m




```scala211
val emp = new Employee("Naga", 30)
println(emp.getName())
println(emp.getAge())
```

    Naga
    30





    [36memp[39m: [32mEmployee[39m = $sess.cmd38Wrapper$Helper$Employee@6fc4224d




```scala211
//Scala Secondary or auxiliary Constructor

class Employee(name:String, age:Int){
 var place = ""
 def this(name:String, age:Int, place:String){
     this(name, age)
     this.place = place
 }
 def getName(): String = {
  (name)
 }
 def getAge(): Int = {
  (age)
 }
 def getPlace():String = {
     (place)
 }
}

```




    defined [32mclass[39m [36mEmployee[39m




```scala211
val emp = new Employee("Naga", 30)
val employee = new Employee("Ravi", 33, "Mysore")
```




    [36memp[39m: [32mEmployee[39m = $sess.cmd42Wrapper$Helper$Employee@77d0a846
    [36memployee[39m: [32mEmployee[39m = $sess.cmd42Wrapper$Helper$Employee@1821134




```scala211
emp.getName()
employee.getPlace()
```




    [36mres44_0[39m: [32mString[39m = [32m"Naga"[39m
    [36mres44_1[39m: [32mString[39m = [32m"Mysore"[39m




```scala211
class Maths{
 def add(a:Int, b:Int) : Int = {
    (a + b)
 }
 def add(a:Int, b:Int, c:Int) :Int = {
    (a + b + c)
 }
 def add(a:Int, b:Float) : Float = {
     (a + b)
 }
}
```




    defined [32mclass[39m [36mMaths[39m




```scala211
val maths = new Maths()
println(maths.add(10, 20))
println(maths.add(10, 20, 30))
println(maths.add(10, 30.20f))
```

    30
    60
    40.2





    [36mmaths[39m: [32mMaths[39m = $sess.cmd46Wrapper$Helper$Maths@5fd247bb




```scala211
//this keyword
class Employee{
    var name = ""
    var age = 0
    var place = ""
    def this(name:String, age:Int, place:String){
        this()
        this.name = name
        this.age = age
        this.place = place
    }
}
```




    defined [32mclass[39m [36mEmployee[39m




```scala211
val emp = new Employee("Naga", 30, "Mysore")
println(emp.name)
println(emp.age)
println(emp.place)
```

    Naga
    30
    Mysore





    [36memp[39m: [32mEmployee[39m = $sess.cmd48Wrapper$Helper$Employee@41b1d2b6




```scala211
class Employee{
    val age = 30
    def message(){
        
    }
}

class Programmer extends Employee{
    override val age = 40
    override def message(){
        println("You are Programmer")
    }
}

val programmer = new Programmer()
println(programmer.age)
programmer.message()
```

    40
    You are Programmer





    defined [32mclass[39m [36mEmployee[39m
    defined [32mclass[39m [36mProgrammer[39m
    [36mprogrammer[39m: [32mwrapper[39m.[32mwrapper[39m.[32mProgrammer[39m = $sess.cmd53Wrapper$Helper$Programmer@4d4eba6e




```scala211
//Scala Abstract Classes
abstract class Employee{
    def getName() : String
    def getAge() :Int
}

class Manager(name:String, age:Int) extends Employee {
    def getName() : String = {
        (name)
    }
    def getAge() : Int = {
       (age)
    }
}
```




    defined [32mclass[39m [36mEmployee[39m
    defined [32mclass[39m [36mManager[39m




```scala211
val manager = new Manager("Arjun", 35)
println(manager.getName)
println(manager.getAge)
```

    Arjun
    35





    [36mmanager[39m: [32mManager[39m = $sess.cmd56Wrapper$Helper$Manager@2fc43c9c




```scala211
trait Shape{
    def area(x:Double, y:Double) : Double
}

trait Printable{
    def printShape(shape:String)
}

class Rectangle extends Shape with Printable{
    def printShape(shape:String) {
        println("The shape type is: " + shape)
    }
    def area(x:Double, y:Double) : Double = {
        (x * y)
    }
}
```




    defined [32mtrait[39m [36mShape[39m
    defined [32mtrait[39m [36mPrintable[39m
    defined [32mclass[39m [36mRectangle[39m




```scala211
val rectangle = new Rectangle()
rectangle.printShape("Rectangle")
val area = rectangle.area(10.0, 20.0)
println("Area of rectangle is: " + area)
```

    The shape type is: Rectangle
    Area of rectangle is: 200.0





    [36mrectangle[39m: [32mRectangle[39m = $sess.cmd61Wrapper$Helper$Rectangle@4abebe44
    [36marea[39m: [32mDouble[39m = [32m200.0[39m




```scala211
//Scala Arrays
val numbers = new Array[Int](10)
for(i <- 0 until 10){
    numbers(i) = i
}

for(num <- numbers){
    println(num)
}
```

    0
    1
    2
    3
    4
    5
    6
    7
    8
    9





    [36mnumbers[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m0[39m, [32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)




```scala211
val matrix = Array.ofDim[Int](2,2)
```




    [36mmatrix[39m: [32mArray[39m[[32mArray[39m[[32mInt[39m]] = [33mArray[39m([33mArray[39m([32m0[39m, [32m0[39m), [33mArray[39m([32m0[39m, [32m0[39m))




```scala211
matrix(0)(0) = 1
matrix(0)(1) = 2
matrix(1)(0) = 3
matrix(1)(1) = 4

println(matrix(1)(1))
```

    4



```scala211
val persons = Array(Array("Naga", "Ravi"), Array(30, 33))
```




    [36mpersons[39m: [32mArray[39m[[32mArray[39m[[32m_96[39m] forSome { type [32m_96[39m >: [32mInt[39m with [32mString[39m }] = [33mArray[39m([Ljava.lang.String;@43c18401, [I@706f187e)




```scala211
println(persons(0)(0))
println(persons(0)(1))
println(persons(1)(0))
```

    Naga
    Ravi
    30



```scala211
// Scala Strings
val firstName = "Arjun"
val surName = " A"
val name = firstName + "" + surName
val fullName = firstName.concat(surName)
println(name)
println(fullName)
```

    Arjun A
    ArjunA





    [36mfirstName[39m: [32mString[39m = [32m"Arjun"[39m
    [36msurName[39m: [32mString[39m = [32m"A"[39m
    [36mname[39m: [32mString[39m = [32m"Arjun A"[39m
    [36mfullName[39m: [32mString[39m = [32m"ArjunA"[39m




```scala211
val name = "Naga"
val name1 = "Naga"
if(name == name1){
    println("Equal")
}else{
    println("Not Equal")
}

if(name.equals(name1)){
    println("Equal")
}else{
    println("Not Equal")
}
```

    Equal
    Equal





    [36mname[39m: [32mString[39m = [32m"Naga"[39m
    [36mname1[39m: [32mString[39m = [32m"Naga"[39m




```scala211
val name = new String("Naga")
val name1 = new String("Naga")

if(name == name1){
    println("Equal")
}else{
    println("Not Equal")
}
```

    Equal





    [36mname[39m: [32mString[39m = [32m"Naga"[39m
    [36mname1[39m: [32mString[39m = [32m"Naga"[39m




```scala211
val name = "Naga"
println("Name: " + name)
println(s"Name: $name")
```

    Name: Naga
    Name: Naga





    [36mname[39m: [32mString[39m = [32m"Naga"[39m




```scala211
var message = raw"naga\t30\tbangalore\n"
println(message)
```

    naga\t30\tbangalore\n





    [36mmessage[39m: [32mString[39m = [32m"""
    naga\t30\tbangalore\n
    """[39m




```scala211
class Maths{
    def divide(nums:Array[Int]){
        for(num <- nums){
            val division = 100 / num
            println(division)
        }
    }
}

val math = new Maths()
val numbers = Array(1,2,3,4,5,0,6,7,8,9)
math.divide(numbers)
```

    100
    50
    33
    25
    20



    java.lang.ArithmeticException: / by zero

      $sess.cmd80Wrapper$Helper$Maths$$anonfun$divide$1.apply$mcVI$sp(cmd80.sc:4)

      $sess.cmd80Wrapper$Helper$Maths$$anonfun$divide$1.apply(cmd80.sc:3)

      $sess.cmd80Wrapper$Helper$Maths$$anonfun$divide$1.apply(cmd80.sc:3)

      scala.collection.IndexedSeqOptimized$class.foreach(IndexedSeqOptimized.scala:33)

      scala.collection.mutable.ArrayOps$ofInt.foreach(ArrayOps.scala:234)

      $sess.cmd80Wrapper$Helper$Maths.divide(cmd80.sc:3)

      $sess.cmd80Wrapper$Helper.<init>(cmd80.sc:12)

      $sess.cmd80Wrapper.<init>(cmd80.sc:733)

      $sess.cmd80$.<init>(cmd80.sc:383)

      $sess.cmd80$.<clinit>(cmd80.sc:-1)



```scala211
class Maths{
    def divide(nums:Array[Int]){
          for(num <- nums){
            try{
            val division = 100 / num
            println(division)
            }catch{
            case ae:ArithmeticException => println(ae.getMessage())
            }  
        }  
        }   
    }
}

val math = new Maths()
val numbers = Array(1,2,3,4,5,0,6,7,8,9)
math.divide(numbers)
```

    100
    Finaly block always executes
    50
    Finaly block always executes
    33
    Finaly block always executes
    25
    Finaly block always executes
    20
    Finaly block always executes
    / by zero
    Finaly block always executes
    16
    Finaly block always executes
    14
    Finaly block always executes
    12
    Finaly block always executes
    11
    Finaly block always executes





    defined [32mclass[39m [36mMaths[39m
    [36mmath[39m: [32mwrapper[39m.[32mwrapper[39m.[32mMaths[39m = $sess.cmd83Wrapper$Helper$Maths@609df808
    [36mnumbers[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m0[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)




```scala211
class Vote{
    def validate(age:Int){
        if(age <= 18){
            throw new ArithmeticException("You are not eligible for voting!")
        }else{
            println("You are eligible for voting!")
        }
    }
}

val vote = new Vote()
vote.validate(12)
```


    java.lang.ArithmeticException: You are not eligible for voting!

      $sess.cmd85Wrapper$Helper$Vote.validate(cmd85.sc:4)

      $sess.cmd85Wrapper$Helper.<init>(cmd85.sc:12)

      $sess.cmd85Wrapper.<init>(cmd85.sc:761)

      $sess.cmd85$.<init>(cmd85.sc:399)

      $sess.cmd85$.<clinit>(cmd85.sc:-1)



```scala211
class StrToNum{
    @throws(classOf[NumberFormatException])
    def strToNum(number:String){
        val num:Int = number.toInt
        println(num)
    }
}
val sn = new StrToNum()
sn.strToNum("ABC")
```


    java.lang.NumberFormatException: For input string: "ABC"

      java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)

      java.lang.Integer.parseInt(Integer.java:580)

      java.lang.Integer.parseInt(Integer.java:615)

      scala.collection.immutable.StringLike$class.toInt(StringLike.scala:273)

      scala.collection.immutable.StringOps.toInt(StringOps.scala:29)

      $sess.cmd88Wrapper$Helper$StrToNum.strToNum(cmd88.sc:4)

      $sess.cmd88Wrapper$Helper.<init>(cmd88.sc:9)

      $sess.cmd88Wrapper.<init>(cmd88.sc:773)

      $sess.cmd88$.<init>(cmd88.sc:405)

      $sess.cmd88$.<clinit>(cmd88.sc:-1)



```scala211
//Scala Collections
val names = Set("naga", "ravi", "hari", "ravi")
```




    [36mnames[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"naga"[39m, [32m"ravi"[39m, [32m"hari"[39m)




```scala211
//merge two sets
val names = Set("naga", "ravi", "hari", "ravi")
val names1 = Set("kiran", "kishore", "ashok", "amit")
val namesList = names ++ names1
namesList
```




    [36mnames1[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"kiran"[39m, [32m"kishore"[39m, [32m"ashok"[39m, [32m"amit"[39m)
    [36mnamesList[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"kiran"[39m, [32m"ravi"[39m, [32m"naga"[39m, [32m"amit"[39m, [32m"kishore"[39m, [32m"ashok"[39m, [32m"hari"[39m)
    [36mres91_2[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"kiran"[39m, [32m"ravi"[39m, [32m"naga"[39m, [32m"amit"[39m, [32m"kishore"[39m, [32m"ashok"[39m, [32m"hari"[39m)




```scala211
//Adding and removing elements
var names = Set("naga", "ravi", "hari", "ravi")
println(names)
names += "siva"
println(names)
names -= "ravi"
println(names)
```

    Set(naga, ravi, hari)
    Set(naga, ravi, hari, siva)
    Set(naga, hari, siva)





    [36mnames[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"naga"[39m, [32m"hari"[39m, [32m"siva"[39m)




```scala211
//Iterating over sets
for(name <- names){
    println(name)
}
```

    naga
    hari
    siva



```scala211
names.foreach(item => println(item))
```

    naga
    hari
    siva



```scala211
//set operations
val A = Set("a", "b", "c", "d")
val B = Set("c", "d", "e", "f")

val intersection = A.intersect(B)
val union = A.union(B)
println(intersection)
println(union)
```

    Set(c, d)
    Set(e, f, a, b, c, d)





    [36mA[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"a"[39m, [32m"b"[39m, [32m"c"[39m, [32m"d"[39m)
    [36mB[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"c"[39m, [32m"d"[39m, [32m"e"[39m, [32m"f"[39m)
    [36mintersection[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"c"[39m, [32m"d"[39m)
    [36munion[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"e"[39m, [32m"f"[39m, [32m"a"[39m, [32m"b"[39m, [32m"c"[39m, [32m"d"[39m)




```scala211
//Sorted Set
import scala.collection.immutable.SortedSet

val numbers = SortedSet(2,4,3,1,6,5,7,9,8)
println(numbers)
```

    TreeSet(1, 2, 3, 4, 5, 6, 7, 8, 9)





    [32mimport [39m[36mscala.collection.immutable.SortedSet
    
    [39m
    [36mnumbers[39m: [32mcollection[39m.[32mimmutable[39m.[32mSortedSet[39m[[32mInt[39m] = [33mTreeSet[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)




```scala211
import scala.collection.mutable.Set

val names:Set[String] = Set()
println(names)

names += "Naga"
println(names)
names += "Ravi"
println(names)
```

    Set()
    Set(Naga)
    Set(Naga, Ravi)





    [32mimport [39m[36mscala.collection.mutable.Set
    
    [39m
    [36mnames[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"Naga"[39m, [32m"Ravi"[39m)
    [36mres102_3[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"Naga"[39m, [32m"Ravi"[39m)
    [36mres102_5[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"Naga"[39m, [32m"Ravi"[39m)




```scala211
val names = List("ravi")
```




    [36mnames[39m: [32mList[39m[[32mString[39m] = [33mList[39m([32m"ravi"[39m)




```scala211
names += "Ravi"
```

    cmd104.sc:1: value += is not a member of List[String]
      Expression does not convert to assignment because receiver is not assignable.
    val res104 = names += "Ravi"
                       ^


    Compilation Failed



```scala211
import scala.collection.mutable.ListBuffer
val names1:ListBuffer[String] = new ListBuffer()
println(names1)
names1 += "Ravi"
println(names1)
```

    ListBuffer()
    ListBuffer(Ravi)





    [32mimport [39m[36mscala.collection.mutable.ListBuffer
    [39m
    [36mnames1[39m: [32mListBuffer[39m[[32mString[39m] = [33mListBuffer[39m([32m"Ravi"[39m)
    [36mres106_3[39m: [32mListBuffer[39m[[32mString[39m] = [33mListBuffer[39m([32m"Ravi"[39m)




```scala211
val states = Map("KA" -> "Bangalore", "TN" -> "Chennai")
println(states)
```

    Map(KA -> Bangalore, TN -> Chennai)





    [36mstates[39m: [32mMap[39m[[32mString[39m, [32mString[39m] = [33mMap[39m([32m"KA"[39m -> [32m"Bangalore"[39m, [32m"TN"[39m -> [32m"Chennai"[39m)




```scala211
states += ("KL" -> "Trivendram")
println(states)
```

    cmd108.sc:1: value += is not a member of scala.collection.immutable.Map[String,String]
      Expression does not convert to assignment because receiver is not assignable.
    val res108_0 = states += ("KL" -> "Trivendram")
                          ^


    Compilation Failed



```scala211
import scala.collection.mutable.Map

val states = Map("KA" -> "Bangalore", "TN" -> "Chennai")
println(states)
```

    Map(TN -> Chennai, KA -> Bangalore)





    [32mimport [39m[36mscala.collection.mutable.Map
    
    [39m
    [36mstates[39m: [32mcollection[39m.[32mmutable[39m.[32mMap[39m[[32mString[39m, [32mString[39m] = [33mMap[39m([32m"TN"[39m -> [32m"Chennai"[39m, [32m"KA"[39m -> [32m"Bangalore"[39m)




```scala211
states += ("KL" -> "Trivendram")
println(states)
```

    Map(KL -> Trivendram, TN -> Chennai, KA -> Bangalore)





    [36mres109_0[39m: [32mMap[39m[[32mString[39m, [32mString[39m] = [33mMap[39m([32m"KL"[39m -> [32m"Trivendram"[39m, [32m"TN"[39m -> [32m"Chennai"[39m, [32m"KA"[39m -> [32m"Bangalore"[39m)




```scala211
//Scala Tuples

val data = (1,2,3)
println(data)
val data1 = (1,2,3, "naga", "siva")
println(data1)
```

    (1,2,3)
    (1,2,3,naga,siva)





    [36mdata[39m: ([32mInt[39m, [32mInt[39m, [32mInt[39m) = ([32m1[39m, [32m2[39m, [32m3[39m)
    [36mdata1[39m: ([32mInt[39m, [32mInt[39m, [32mInt[39m, [32mString[39m, [32mString[39m) = ([32m1[39m, [32m2[39m, [32m3[39m, [32m"naga"[39m, [32m"siva"[39m)




```scala211
//Accessing Tuple elements
println(data._1)
println(data1._4)
```

    1
    naga



```scala211
//Scala File reads and Writes
import scala.io.Source

val lines = Source.fromFile("/home/naga/bigdata/states").getLines()
for(line <- lines){
    println(line)
}

```

    bihar	patna	2
    goa	panjim	4
    karnataka	Bangalore	7
    TN	chennai	9
    Delhi	New Delhi	20
    UP	Lucknow	11





    [32mimport [39m[36mscala.io.Source
    
    [39m
    [36mlines[39m: [32mIterator[39m[[32mString[39m] = empty iterator




```scala211
//Scala Option
def toInteger(num:String) : Option[Int] = {
    try{
        Some(num.toInt)
    }catch{
        case nfe: NumberFormatException => None
    }
}

```




    defined [32mfunction[39m [36mtoInteger[39m




```scala211
val number = toInteger("100")
```




    [36mnumber[39m: [32mOption[39m[[32mInt[39m] = [33mSome[39m([32m100[39m)




```scala211
println(number.get)
```

    100



```scala211
val Nan = toInteger("ABC")
println(Nan)
```

    None





    [36mNan[39m: [32mOption[39m[[32mInt[39m] = None




```scala211
//Scala Either

def validateName(name: String): Either[String, String] = {
 if (name.isEmpty) Left("Name cannot be empty")
 else Right(name)
 }
```




    defined [32mfunction[39m [36mvalidateName[39m




```scala211
val value = validateName("Naga")
println(value.right.toOption.get)
```

    Naga





    [36mvalue[39m: [32mEither[39m[[32mString[39m, [32mString[39m] = [33mRight[39m([32m"Naga"[39m)




```scala211
val value = validateName("")
println(value.left.toOption.get)
```

    Name cannot be empty





    [36mvalue[39m: [32mEither[39m[[32mString[39m, [32mString[39m] = [33mLeft[39m([32m"Name cannot be empty"[39m)




```scala211
//Scala Option

def validateName(name: String): Option[String] = {
 if (name.isEmpty) None
 else Some(name)
}
```




    defined [32mfunction[39m [36mvalidateName[39m




```scala211
val value = validateName("Naga")
println(value.get)
```

    Naga





    [36mvalue[39m: [32mOption[39m[[32mString[39m] = [33mSome[39m([32m"Naga"[39m)




```scala211
val value = validateName("")
println(value)
```

    None





    [36mvalue[39m: [32mOption[39m[[32mString[39m] = None




```scala211
import scala.util.Try

def divide(num:Int) : Try[Int] = {
    val data = Try(100 / num)
    (data)
}
```




    [32mimport [39m[36mscala.util.Try
    
    [39m
    defined [32mfunction[39m [36mdivide[39m




```scala211
val number = 10
val data = divide(number)
println(data.toOption.get)
```

    10





    [36mnumber[39m: [32mInt[39m = [32m10[39m
    [36mdata[39m: [32mTry[39m[[32mInt[39m] = [33mSuccess[39m([32m10[39m)




```scala211
val number = 0
val data = divide(number)
println(data.toOption)
```

    None





    [36mnumber[39m: [32mInt[39m = [32m0[39m
    [36mdata[39m: [32mTry[39m[[32mInt[39m] = [33mFailure[39m(java.lang.ArithmeticException: / by zero)




```scala211
var name = Nil
```




    [36mname[39m: [32mNil[39m.type = [33mList[39m()




```scala211
val events = (1,2,3,4,5,"Hari", 'c', "ravi")
```




    [36mevents[39m: ([32mInt[39m, [32mInt[39m, [32mInt[39m, [32mInt[39m, [32mInt[39m, [32mString[39m, [32mChar[39m, [32mString[39m) = ([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m"Hari"[39m, [32m'c'[39m, [32m"ravi"[39m)




```scala211
println(events._6)
```

    Hari

