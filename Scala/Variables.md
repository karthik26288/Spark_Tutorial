## Scala variables:
* Scala supports two types of variables of any data type.
  * var -- Mutable variables i.e., reassignment
  * val -- Immutable variables i.e., constant
* Scala variable declarations:
```
var variableName: [Data Type] = <value>
val variableName: [Data Type] = <value>

Example:
  var name: String = "ravi"
  var name = "hari" --> Type Inference
  
  val number: Int = 10
  val number = 10 --> Type Inference
  
  val (name: String, age:Int) = Pair("Ravi", 30)
   val (name, age) = Pair("Ravi", 30) --> Type Inference
```

### Variable Scope:
 * Fields:
   * Fields are varibales belong to Object
   * Access inside and outside
   * vals and vars i.e., mutable and immutable
 * Method Parameters:
   * Method arguments
   * Only vals i.e., always Immutable
   * Inside method
 * Local variables:
   * Declared inside the method
   * vals and vars i.e., mutable and immutable
   * Inside the method
   
   
