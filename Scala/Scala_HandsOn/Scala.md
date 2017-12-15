

```scala211
val name = "Naga"
```




    [36mname[39m: [32mString[39m = [32m"Naga"[39m




```scala211
val (name:String, age:Int) = Pair("Hari", 40)
```




    [36mname[39m: [32mString[39m = [32m"Hari"[39m
    [36mage[39m: [32mInt[39m = [32m40[39m




```scala211
val (name, age) = Pair("Ravi", 30)
```




    [36mname[39m: [32mString[39m = [32m"Ravi"[39m
    [36mage[39m: [32mInt[39m = [32m30[39m




```scala211
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
```




    defined [32mclass[39m [36mEmployee[39m




```scala211
val emp = new Employee("Naga", 30, "Architect")
println(emp.getName)
println(emp.getAge)
println(emp.getRole)
```

    Naga
    30
    Architect





    [36memp[39m: [32mEmployee[39m = $sess.cmd4Wrapper$Helper$Employee@811f0ce




```scala211
class Manager(name:String, age:Int, role:String, team:String) extends Employee(name:String, age:Int, role:String){
    val this.team = team
    def getTeam() : String = {
        return team
    }
}
```




    defined [32mclass[39m [36mManager[39m




```scala211
val emp = new Manager("Naga", 30, "Architect", "Hadoop")
println(emp.getName)
println(emp.getAge)
println(emp.getRole)
println(emp.getTeam)
```

    Naga
    30
    Architect
    Hadoop





    [36memp[39m: [32mManager[39m = $sess.cmd6Wrapper$Helper$Manager@2118b0e




```scala211
class Employee {
   private var name:String = null
   private var age:Int = 0
   private var place:String = null
   
   def setName(name:String) = {
    this.name = name
   }
   def getName(): String = {
       (this.name)
   }
}
```




    defined [32mclass[39m [36mEmployee[39m




```scala211
val emp = new Employee()
emp.setName("Naga")
println(emp.getName)
```

    Naga





    [36memp[39m: [32mEmployee[39m = $sess.cmd10Wrapper$Helper$Employee@7ba0cf6




```scala211
val a = 10
if(a < 20){
    println("Hai")
}
```

    Hai





    [36ma[39m: [32mInt[39m = [32m10[39m




```scala211
val a = 30
if (a < 20 ){
    println("hai")
}else{
    println("Bye")
}
```

    Bye





    [36ma[39m: [32mInt[39m = [32m30[39m




```scala211
for(i <- 1 to 10){
    println(i)
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



```scala211
for(i <- 1 until 10){
    println(i)
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



```scala211
val names = List("ravi", "hari", "siva", "rajesh")
for(name <- names){
    println(name)
}
```

    ravi
    hari
    siva
    rajesh





    [36mnames[39m: [32mList[39m[[32mString[39m] = [33mList[39m([32m"ravi"[39m, [32m"hari"[39m, [32m"siva"[39m, [32m"rajesh"[39m)




```scala211
val numbers = List(1,2,3,4,5,6,7,8,9)
val even = for(num <- numbers if num % 2 == 0) yield num
```




    [36mnumbers[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m1[39m, [32m2[39m, [32m3[39m, [32m4[39m, [32m5[39m, [32m6[39m, [32m7[39m, [32m8[39m, [32m9[39m)
    [36meven[39m: [32mList[39m[[32mInt[39m] = [33mList[39m([32m2[39m, [32m4[39m, [32m6[39m, [32m8[39m)




```scala211
for(num <- even){
    println(num)
}
```

    2
    4
    6
    8



```scala211
var a = 0
while( a < 20){
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
    11
    12
    13
    14
    15
    16
    17
    18
    19





    [36ma[39m: [32mInt[39m = [32m20[39m




```scala211
val a = 20
do {
    println(a)
}while(a > 20)
```

    20





    [36ma[39m: [32mInt[39m = [32m20[39m




```scala211
def message(city:String, name:String){
    println(name + " welcome to " + city)
}
```




    defined [32mfunction[39m [36mmessage[39m




```scala211
// Partially Applied Functions
val city = "Bangalore"

var name = "Naga"
message(city, name)
```

    Naga welcome to Bangalore





    [36mcity[39m: [32mString[39m = [32m"Bangalore"[39m
    [36mname[39m: [32mString[39m = [32m"Naga"[39m




```scala211
val messageBangalore = message(city, _:String)
```




    [36mmessageBangalore[39m: [32mString[39m => [32mUnit[39m = <function1>




```scala211
messageBangalore("Rajesh")
```

    Rajesh welcome to Bangalore



```scala211
messageBangalore("Ravi")
```

    Ravi welcome to Bangalore



```scala211
//Recursive Functions
def fact(n:Int) : Int = {
    if(n < 1){
        return 1
    }else{
        return n * fact(n -1)
;    }
}
```




    defined [32mfunction[39m [36mfact[39m




```scala211
fact(1)
```




    [36mres6[39m: [32mInt[39m = [32m1[39m




```scala211
fact(0)
```




    [36mres7[39m: [32mInt[39m = [32m1[39m




```scala211
fact(10)
```




    [36mres8[39m: [32mInt[39m = [32m3628800[39m




```scala211
def message(f: String => String, message:String) = f(message)
```




    defined [32mfunction[39m [36mmessage[39m




```scala211
def hai(msg:String) :String = {
    return "Hai this " + msg + " for you"
}
```




    defined [32mfunction[39m [36mhai[39m




```scala211
message(hai, "message from President")
```




    [36mres11[39m: [32mString[39m = [32m"Hai this message from President for you"[39m




```scala211
// Anonymous Functions
var inc = (x:Int) => x + 1
```




    [36minc[39m: [32mInt[39m => [32mInt[39m = <function1>




```scala211
val number = inc(10)
```




    [36mnumber[39m: [32mInt[39m = [32m11[39m




```scala211
def mul(a:Int)(b:Int)(c:Int) = {
    a * b * c
}
```




    defined [32mfunction[39m [36mmul[39m




```scala211
mul(10)(2)(30)
```




    [36mres15[39m: [32mInt[39m = [32m600[39m




```scala211
//Scala Closure
val a = 20
val sum = (b:Int) => b + a
```




    [36ma[39m: [32mInt[39m = [32m20[39m
    [36msum[39m: [32mInt[39m => [32mInt[39m = <function1>




```scala211
sum(30)
```




    [36mres17[39m: [32mInt[39m = [32m50[39m




```scala211
sum(100)
```




    [36mres18[39m: [32mInt[39m = [32m120[39m




```scala211
//Scala Strings

val name = "Naga"
val places = """
Bangalore
Hyderabad
Chennai
Mumbai
Vizag
"""
```




    [36mname[39m: [32mString[39m = [32m"Naga"[39m
    [36mplaces[39m: [32mString[39m = [32m"""
    
    Bangalore
    Hyderabad
    Chennai
    Mumbai
    Vizag
    
    """[39m




```scala211
name.length
```




    [36mres20[39m: [32mInt[39m = [32m4[39m




```scala211
val surName = " I"
name.concat(surName)
```




    [36msurName[39m: [32mString[39m = [32m" I"[39m
    [36mres22_1[39m: [32mString[39m = [32m"Naga I"[39m




```scala211
println(s"The name is $name")
```

    The name is Naga

