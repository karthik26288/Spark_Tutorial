## Scala Control Structures:
* Branching
  if-else
```
  if (<condition>){
  }
  
  val a = 10
  if(a < 20){
    println("Hai")
  }
  
  val a = 30
  if (a < 20 ){
    println("hai")
  }else{
    println("Bye")
  }
```
* Looping
  * for loop:
   ```
    for( var varName <- []){
      statements.....
    }
    
    for(i <- 1 to 10){
        println(i)
    }
    
    for(i <- 1 until 10){
      println(i)
    }

    val names = List("ravi", "hari", "siva", "rajesh")
    for(name <- names){
      println(name)
    }
    
    val numbers = List(1,2,3,4,5,6,7,8,9)
    val even = for(num <- numbers if num % 2 == 0) yield num
    
    for(num <- even){
      println(num)
    }
   ```
   * while loop:
   ```
    while(<condition>){
      statements...
    }
    
    var a = 0
    while( a < 20){
      println(a)
      a = a + 1
    }
   ```
   * do-while loop:
   ```
    do{
      statements
    } while(<condition>)
    
    val a = 20
    do {
      println(a)
    }while(a > 20)
   ```
