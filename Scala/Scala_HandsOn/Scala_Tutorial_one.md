

```scala211
//Scala Control Structures
val age = 16

if( age > 18){
    println("Allowed to Vote!")
}else{
    println("Not Allowed to Vote")
}
```

    Not Allowed to Vote





    [36mage[39m: [32mInt[39m = [32m16[39m




```scala211
val age = 45
if(age <= 16){
    println("Younger")
}else if(age > 16 && age <=40){
    println("Middle Age")
}else{
    println("Older")
}
```

    Older





    [36mage[39m: [32mInt[39m = [32m45[39m




```scala211
val age:Int = 30
val younger = "Younger"
val old = "Old"
val ageGroup = age == 35 ? old : younger
println(ageGroup)
```

    cmd6.sc:4: not found: type younger
    val ageGroup = age == 35 ? old : younger
                                     ^cmd6.sc:4: value ? is not a member of Int
    val ageGroup = age == 35 ? old : younger
                             ^


    Compilation Failed



```scala211
val marks = 50
```




    [36mmarks[39m: [32mInt[39m = [32m50[39m




```scala211
if(marks == 35){
    println("Pass")
}else if(marks >35 && marks <= 60){
    println("Second Class")
}else if(marks > 60 && marks <= 70){
    println("First Class")
}else if(marks > 70){
    println("Distinction")
}else{
    println("Fail")
}
```

    Second Class



```scala211
val marks = 50

val pass = 35
val second = 

val result = marks match{
    case  pass => ("Pass")
    case  50 => ("Second Class")
    case  60 => ("First Class")
    case  70 => ("Distinction")
    case  _ =>  ("Fail")
}
```




    [36mmarks[39m: [32mInt[39m = [32m50[39m
    [36mresult[39m: [32mString[39m = [32m"Second Class"[39m




```scala211
var a = 0
while(a  <= 10){
    println(a)
    a = a + 1
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
    10





    [36ma[39m: [32mInt[39m = [32m11[39m




```scala211
a = 10
do{
    println(a)
    a = a + 1
}while(a < 12)
```

    10
    11



```scala211
val names = List("ravi", "hari", "siva")
for(name <- names){
    println(name)
}
```

    ravi
    hari
    siva





    [36mnames[39m: [32mList[39m[[32mString[39m] = [33mList[39m([32m"ravi"[39m, [32m"hari"[39m, [32m"siva"[39m)




```scala211
val names = Set("ravi", "hari", "siva")
for(name <- names){
    println(name)
}
```

    ravi
    hari
    siva





    [36mnames[39m: [32mSet[39m[[32mString[39m] = [33mSet[39m([32m"ravi"[39m, [32m"hari"[39m, [32m"siva"[39m)




```scala211
for(i <- 0 to 10){
    println(i)
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
    10



```scala211
for(i <- 0 until 10){
    println(i)
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



```scala211
val numbers = Array(1,2,3,4,5,6)
for(i <- numbers){
    println(i)
}
```

    1
    2
    3
    4
    5
    6





    [36mnumbers[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m6[39m)




```scala211
numbers.foreach(println)
```

    1
    2
    3
    4
    5
    6



```scala211
numbers.foreach(num => println(num))
```

    1
    2
    3
    4
    5
    6



```scala211
names.foreach(println)
```

    ravi
    hari
    siva



```scala211
for(i <- 0 to 10 if i % 2 == 0){
    println(i)
}
```

    0
    2
    4
    6
    8
    10



```scala211
val even = for(i <- 0 to 10 if i % 2 == 0) yield i
even
```




    [36meven[39m: [32mcollection[39m.[32mimmutable[39m.[32mIndexedSeq[39m[[32mInt[39m] = [33mVector[39m([32m0[39m, [32m2[39m, [32m4[39m, [32m6[39m, [32m8[39m, [32m10[39m)
    [36mres31_1[39m: [32mcollection[39m.[32mimmutable[39m.[32mIndexedSeq[39m[[32mInt[39m] = [33mVector[39m([32m0[39m, [32m2[39m, [32m4[39m, [32m6[39m, [32m8[39m, [32m10[39m)




```scala211
for(i <- 0 to 10 by 3){
    println(i)
}
```

    0
    3
    6
    9



```scala211
//Scala Functions
```


```scala211
def add(a:Int, b:Int) : Int = {
   (a + b)
}

val sum = add(10, 20)
```




    defined [32mfunction[39m [36madd[39m
    [36msum[39m: [32mInt[39m = [32m30[39m




```scala211
def hai() : Unit = {
    println("Hai")
}
hai()
```

    Hai





    defined [32mfunction[39m [36mhai[39m




```scala211
def hai(message:String) : Unit = {
    println(message)
}
hai("Scala")
```

    Scala





    defined [32mfunction[39m [36mhai[39m




```scala211
def getNumbers() : Array[Int] = {
    val numbers = Array(1,2,3,4)
    (numbers)
}
getNumbers()
```




    defined [32mfunction[39m [36mgetNumbers[39m
    [36mres40_1[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m)




```scala211
val inc = (x:Int) => x + 1
inc(20)
```




    [36minc[39m: [32mInt[39m => [32mInt[39m = <function1>
    [36mres42_1[39m: [32mInt[39m = [32m21[39m




```scala211
def inc(x:Int) : Int = {
    (x + 1)
}
```


```scala211
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
def add(a:Int=10, b:Int=20) : Int = {
    println(s"a: $a")
    println(s"b: $b")
    (a + b)
}
add()
add(30, 40)
add(b=40, a=20)
```

    a: 10
    b: 20
    a: 30
    b: 40
    a: 20
    b: 40





    defined [32mfunction[39m [36madd[39m
    [36mres46_1[39m: [32mInt[39m = [32m30[39m
    [36mres46_2[39m: [32mInt[39m = [32m70[39m
    [36mres46_3[39m: [32mInt[39m = [32m60[39m




```scala211
def sum(nums:Int*) : Int = {
    var s = 0
    for(num <- nums){
        s = s + num
    }
    (s)
}

val result = sum(1,2,3,4,5)
```




    defined [32mfunction[39m [36msum[39m
    [36mresult[39m: [32mInt[39m = [32m15[39m




```scala211
def add(a:Int, b:Int) : Int = {
    (a + b)
}
add(10, 20)
```




    defined [32mfunction[39m [36madd[39m
    [36mres49_1[39m: [32mInt[39m = [32m30[39m




```scala211
// add(a, b)
// g(b) = add(10, b)


def add(a:Int)(b:Int) : Int = {
    (a + b)
}

val adding = add(10)_
adding(40)
```




    defined [32mfunction[39m [36madd[39m
    [36madding[39m: [32mInt[39m => [32mInt[39m = <function1>
    [36mres53_2[39m: [32mInt[39m = [32m50[39m




```scala211
def fact(n:Int): Int = {
    if(n < 1){
        return 1
    }else{
        return n * fact(n - 1)
    }
}

val result = fact(6)
```




    defined [32mfunction[39m [36mfact[39m
    [36mresult[39m: [32mInt[39m = [32m720[39m




```scala211
import scala.collection.mutable.ListBuffer

val numbers = Array(1,2,3,4,5)
var squares:ListBuffer[Int] = ListBuffer()
for(i <- numbers){
    squares += i * i
}
squares

val sqrs = for(i <- numbers) yield i * i
sqrs
```




    [32mimport [39m[36mscala.collection.mutable.ListBuffer
    
    [39m
    [36mnumbers[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m)
    [36msquares[39m: [32mListBuffer[39m[[32mInt[39m] = [33mListBuffer[39m([32m1[39m, [32m4[39m, [32m9[39m, [32m16[39m, [32m25[39m)
    [36mres57_4[39m: [32mListBuffer[39m[[32mInt[39m] = [33mListBuffer[39m([32m1[39m, [32m4[39m, [32m9[39m, [32m16[39m, [32m25[39m)
    [36msqrs[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m4[39m, [32m9[39m, [32m16[39m, [32m25[39m)
    [36mres57_6[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m4[39m, [32m9[39m, [32m16[39m, [32m25[39m)




```scala211
//Scala Classes and Objects
```


```scala211
class Person{
    var name = "ABC"
    var age = 30
}
```




    defined [32mclass[39m [36mPerson[39m




```scala211
object PersonExample{
    def main(args:Array[String]) : Unit = {
         val person = new Person()
    println(person.name)
    println(person.age)
    }
}
```




    defined [32mobject[39m [36mPersonExample[39m




```scala211
   val person = new Person
    println(person.name)
    println(person.age)
```

    ABC
    30





    [36mperson[39m: [32mPerson[39m = $sess.cmd58Wrapper$Helper$Person@38282e55




```scala211
class Employee(name:String, age:Int){
    def show(){
    println(this.name)
    println(this.age)
    }
}

val emp = new Employee("Hari", 34)
emp.show()
```

    Hari
    34





    defined [32mclass[39m [36mEmployee[39m
    [36memp[39m: [32mEmployee[39m = $sess.cmd61Wrapper$Helper$Employee@6fed2d0c




```scala211
case class Person(name:String, age:Int)

val person = Person("Hari", 40)
println(person.name)
println(person.age)

```

    Hari
    40





    defined [32mclass[39m [36mPerson[39m
    [36mperson[39m: [32mwrapper[39m.[32mwrapper[39m.[32mPerson[39m = [33mPerson[39m([32m"Hari"[39m, [32m40[39m)




```scala211
class Employee(name:String, age:Int){
    var place = "NA"
    def this(name:String, age:Int, place:String){
        this(name, age)
        this.place = place
    }
    def show(){
    println(this.name)
    println(this.age)
    println(this.place)
    }
}

val emp = new Employee("Hari", 34, "Mysore")
val emp1 = new Employee("Hari", 34)
emp.show()
emp1.show()
```

    Hari
    34
    Mysore
    Hari
    34
    NA





    defined [32mclass[39m [36mEmployee[39m
    [36memp[39m: [32mwrapper[39m.[32mwrapper[39m.[32mEmployee[39m = $sess.cmd64Wrapper$Helper$Employee@2dff6788
    [36memp1[39m: [32mwrapper[39m.[32mwrapper[39m.[32mEmployee[39m = $sess.cmd64Wrapper$Helper$Employee@783477be




```scala211
class Maths{
    def add(a:Int, b:Int) : Int ={
        (a + b)
    }
    def add(a:Int, b:Int, c:Int) = {
        (a + b + c)
    }
}

val math = new Maths()
println(math.add(10, 10))
println(math.add(10, 20, 30))
```

    20
    60





    defined [32mclass[39m [36mMaths[39m
    [36mmath[39m: [32mMaths[39m = $sess.cmd65Wrapper$Helper$Maths@6c1f42e7




```scala211
class Human{
    val name = "NA"
    def message(){
        println("Human")
    }
}
```




    defined [32mclass[39m [36mHuman[39m




```scala211
class Male extends Human {
    override val name = "ABC"
    override def message(){
        println("Male")
        println(this.name)
    }
}

```




    defined [32mclass[39m [36mMale[39m




```scala211
val male = new Male()
male.message()
```

    Male
    ABC





    [36mmale[39m: [32mMale[39m = $sess.cmd72Wrapper$Helper$Male@27824ee5




```scala211
abstract class Human{
    def getName():String
    def getAge():Int
}
```




    defined [32mclass[39m [36mHuman[39m




```scala211
val human = new Human()
```

    cmd1.sc:1: class Human is abstract; cannot be instantiated
    val human = new Human()
                ^


    Compilation Failed



```scala211
class Male(name:String, age:Int) extends Human{
    def getName() : String = {
        (this.name)
    }
    def getAge():Int = {
        (this.age)
    }
}
```




    defined [32mclass[39m [36mMale[39m




```scala211
val person = new Male("Hari", 40)
println(person.getName())
println(person.getAge)
```

    Hari
    40





    [36mperson[39m: [32mMale[39m = $sess.cmd1Wrapper$Helper$Male@5e984b4




```scala211
val male1 = new Male()
```

    cmd3.sc:1: not enough arguments for constructor Male: (name: String, age: Int)cmd3Wrapper.this.cmd1.wrapper.Male.
    Unspecified value parameters name, age.
    val male1 = new Male()
                ^


    Compilation Failed



```scala211
trait Human{
    def getName() : String
    def getAge() : Int
}
```




    defined [32mtrait[39m [36mHuman[39m




```scala211
class Male(name:String, age:Int) extends Human{
    def getName() : String = {
        (this.name)
    }
    def getAge():Int = {
        (this.age)
    }
}
```




    defined [32mclass[39m [36mMale[39m




```scala211
val person = new Male("Hari", 40)
println(person.getName())
println(person.getAge)
```

    Hari
    40





    [36mperson[39m: [32mMale[39m = $sess.cmd4Wrapper$Helper$Male@267190a0




```scala211
abstract class Human{
    def getName():String
    def getAge():Int
}

trait Printable{
    def show()
}

trait Display{
    def message(){
        
    }
}

```




    defined [32mclass[39m [36mHuman[39m
    defined [32mtrait[39m [36mPrintable[39m
    defined [32mtrait[39m [36mDisplay[39m




```scala211
class Male(name:String, age:Int) extends Human with Printable with Display{
    def getName() : String = {
        (this.name)
    }
    def getAge():Int = {
        (this.age)
    }
    def show(){
        val name = this.getName()
        val age = this.getAge()
        println(s"Hi $name, you are $age years old")
    }
}
```




    defined [32mclass[39m [36mMale[39m




```scala211
val person = new Male("Ravi", 35)
person.show()
```

    Hi Ravi, you are 35 years old





    [36mperson[39m: [32mMale[39m = $sess.cmd14Wrapper$Helper$Male@2d6b4f15




```scala211
val numbers = Array(1,2,3,4,0,5,6,7,8,9)
    
for(num <- numbers){
    try{
      println(100 / num)   
    }
    catch{
        case ae:ArithmeticException => println("Division by Zero Exception")
        case e:Exception => println(e.getMessage())
        case _ => println("Reason  for Exception is unknown")
    }
}
```

    100
    50
    33
    25
    Division by Zero Exception
    20
    16
    14
    12
    11





    [36mnumbers[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m0[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)




```scala211
val a = "ABC"
```




    [36ma[39m: [32mString[39m = [32m"ABC"[39m




```scala211
a.toInt
```


    java.lang.NumberFormatException: For input string: "ABC"

      java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)

      java.lang.Integer.parseInt(Integer.java:580)

      java.lang.Integer.parseInt(Integer.java:615)

      scala.collection.immutable.StringLike$class.toInt(StringLike.scala:273)

      scala.collection.immutable.StringOps.toInt(StringOps.scala:29)

      $sess.cmd24Wrapper$Helper.<init>(cmd24.sc:1)

      $sess.cmd24Wrapper.<init>(cmd24.sc:181)

      $sess.cmd24$.<init>(cmd24.sc:113)

      $sess.cmd24$.<clinit>(cmd24.sc:-1)



```scala211
numbers
```




    [36mres25[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m0[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)




```scala211
numbers(2)
```




    [36mres26[39m: [32mInt[39m = [32m3[39m




```scala211
numbers(4) = 10
```


```scala211
numbers
```




    [36mres28[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m10[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)




```scala211
val nums = new Array[Int](10)
```




    [36mnums[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m, [32m0[39m)




```scala211
for(i <- 0 until 10){
    nums(i) = i * i
}
```


```scala211
nums
```




    [36mres31[39m: [32mArray[39m[[32mInt[39m] = [33mArray[39m([32m0[39m, [32m1[39m, [32m4[39m, [32m9[39m, [32m16[39m, [32m25[39m, [32m36[39m, [32m49[39m, [32m64[39m, [32m81[39m)




```scala211
import java.util.Date

val date = new Date()
println(date.isInstanceOf[Date])
```

    true





    [32mimport [39m[36mjava.util.Date
    
    [39m
    [36mdate[39m: [32mDate[39m = Sun Dec 10 11:03:09 IST 2017




```scala211
val a = 100
val b = a.asInstanceOf[Double]
println(b)
```

    100.0





    [36ma[39m: [32mInt[39m = [32m100[39m
    [36mb[39m: [32mDouble[39m = [32m100.0[39m




```scala211
import java.util._
```




    [32mimport [39m[36mjava.util._[39m




```scala211
import java.util.{Date, Calendar}
```




    [32mimport [39m[36mjava.util.{Date, Calendar}[39m




```scala211
val persons = Array(Array("Naga", "Ravi"), Array(30, 33))
```




    [36mpersons[39m: [32mArray[39m[[32mArray[39m[[32m_40[39m] forSome { type [32m_40[39m >: [32mInt[39m with [32mString[39m }] = [33mArray[39m([Ljava.lang.String;@7adbbf67, [I@30530aa5)




```scala211
println(persons(0)(1))
```

    Ravi



```scala211
var message = raw"naga\t30\tbangalore\n"
println(message)
```

    naga\t30\tbangalore\n





    [36mmessage[39m: [32mString[39m = [32m"""
    naga\t30\tbangalore\n
    """[39m




```scala211
//Scala Collections
import scala.collection.mutable.ListBuffer
val names = ListBuffer("Hari")
```




    [32mimport [39m[36mscala.collection.mutable.ListBuffer
    [39m
    [36mnames[39m: [32mcollection[39m.[32mmutable[39m.[32mListBuffer[39m[[32mString[39m] = [33mListBuffer[39m([32m"Hari"[39m)




```scala211
names+= "Ravi"
names += "Kishore"
```




    [36mres48_0[39m: [32mListBuffer[39m[[32mString[39m] = [33mListBuffer[39m([32m"Hari"[39m, [32m"Ravi"[39m, [32m"Ravi"[39m, [32m"Kishore"[39m)
    [36mres48_1[39m: [32mListBuffer[39m[[32mString[39m] = [33mListBuffer[39m([32m"Hari"[39m, [32m"Ravi"[39m, [32m"Ravi"[39m, [32m"Kishore"[39m)




```scala211
val names = List("A", "B", "C", "D")
for(name <- names){
    println(name)
}
```

    A
    B
    C
    D





    [36mnames[39m: [32mList[39m[[32mString[39m] = [33mList[39m([32m"A"[39m, [32m"B"[39m, [32m"C"[39m, [32m"D"[39m)




```scala211
val names = scala.collection.mutable.Set("Hari")
```




    [36mnames[39m: [32mcollection[39m.[32mmutable[39m.[32mSet[39m[[32mString[39m] = [33mSet[39m([32m"Hari"[39m)




```scala211
names += "Ravi"
```




    [36mres52[39m: [32mcollection[39m.[32mmutable[39m.[32mSet[39m[[32mString[39m] = [33mSet[39m([32m"Hari"[39m, [32m"Ravi"[39m)




```scala211
val names = new ArrayList[String]()
```




    [36mnames[39m: [32mArrayList[39m[[32mString[39m] = []




```scala211
import scala.collection.JavaConversions._

names.add("A")
names.add("B")
names.add("C")

for(name <- names){
    println(name)
}
```

    A
    B
    C





    [32mimport [39m[36mscala.collection.JavaConversions._
    
    [39m
    [36mres54_1[39m: [32mBoolean[39m = [32mtrue[39m
    [36mres54_2[39m: [32mBoolean[39m = [32mtrue[39m
    [36mres54_3[39m: [32mBoolean[39m = [32mtrue[39m




```scala211
val numbers = List(1,2,3)
numbers
```




    [36mnumbers[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m1[39m, [32m2[39m, [32m3[39m)
    [36mres63_1[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m1[39m, [32m2[39m, [32m3[39m)




```scala211
def add(a:Int, b:Int) : Int = {
    (a + b)
}
numbers.map(num => num * num).filter(num => num > 30).reduce((a,b) => (a + b))
```


    java.lang.UnsupportedOperationException: empty.reduceLeft

      scala.collection.LinearSeqOptimized$class.reduceLeft(LinearSeqOptimized.scala:137)

      scala.collection.immutable.List.reduceLeft(List.scala:84)

      scala.collection.TraversableOnce$class.reduce(TraversableOnce.scala:208)

      scala.collection.AbstractTraversable.reduce(Traversable.scala:104)

      $sess.cmd64Wrapper$Helper.<init>(cmd64.sc:4)

      $sess.cmd64Wrapper.<init>(cmd64.sc:607)

      $sess.cmd64$.<init>(cmd64.sc:404)

      $sess.cmd64$.<clinit>(cmd64.sc:-1)



```scala211
numbers.max
numbers.min
numbers.sum
```




    [36mres62_0[39m: [32mInt[39m = [32m7[39m
    [36mres62_1[39m: [32mInt[39m = [32m1[39m
    [36mres62_2[39m: [32mInt[39m = [32m28[39m




```scala211
val numbers = List(1,2,3)
val squares = numbers.map(num =>{
 num * num   
})
val sum = squares.reduce((a, b) => (a + b))
sum
```




    [36mnumbers[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m1[39m, [32m2[39m, [32m3[39m)
    [36msquares[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m1[39m, [32m4[39m, [32m9[39m)
    [36msum[39m: [32mInt[39m = [32m14[39m
    [36mres66_3[39m: [32mInt[39m = [32m14[39m




```scala211
//Option

def convertStringToNum(num:String) : Option[Int] = {
    try{
      Some(num.toInt)  
    }catch{
        case e:Exception => None
    }
    
}

val result = convertStringToNum("100")
println(result.get)
```

    100





    defined [32mfunction[39m [36mconvertStringToNum[39m
    [36mresult[39m: [32mOption[39m[[32mInt[39m] = [33mSome[39m([32m100[39m)




```scala211
val numbers = List("1", "2", "3", "ABC", "123")
```




    [36mnumbers[39m: [32mList[39m[[32mString[39m] = [33mList[39m([32m"1"[39m, [32m"2"[39m, [32m"3"[39m, [32m"ABC"[39m, [32m"123"[39m)




```scala211
val nums = numbers.map(num => convertStringToNum(num)).filter(num => num != None).map(num => (num.get))
```




    [36mnums[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m123[39m)




```scala211
val names = List("ravi", "", "siva", "")
def validateName(name: String): Either[String, String] = {
 if (name.isEmpty) Left("Name is empty")
 else Right(name)
 }
```




    [36mnames[39m: [32mList[39m[[32mString[39m] = [33mList[39m([32m"ravi"[39m, [32m""[39m, [32m"siva"[39m, [32m""[39m)
    defined [32mfunction[39m [36mvalidateName[39m




```scala211
for(name <- names){
    val result = validateName(name)
    println(result)
}
```

    Right(ravi)
    Left(Name is empty)
    Right(siva)
    Left(Name is empty)



```scala211
//Try
import scala.util.Try

def divide(num:Int) : Try[Int] = {
    val data = Try(100 / num)
    (data)
}

val result = divide(0)
```




    [32mimport [39m[36mscala.util.Try
    
    [39m
    defined [32mfunction[39m [36mdivide[39m
    [36mresult[39m: [32mTry[39m[[32mInt[39m] = [33mFailure[39m(java.lang.ArithmeticException: / by zero)




```scala211
val factor = 10
```




    [36mfactor[39m: [32mInt[39m = [32m10[39m




```scala211
val data = (x:Int) => x * factor
```




    [36mdata[39m: [32mInt[39m => [32mInt[39m = <function1>




```scala211
data(10)
```




    [36mres87[39m: [32mInt[39m = [32m100[39m




```scala211
var name = Nil
```




    [36mname[39m: [32mNil[39m.type = [33mList[39m()


