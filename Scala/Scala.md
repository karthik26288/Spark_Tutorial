## Scala Overview

* Scala is general purpose programming language.
* Scala is an object-oriented and functional programming language.
* Scala is modern multi paradigm and hybrid programming language.
* Scala designed inspired by Java and Lisp.
* Scala is Scalable language.
* Scala runs on top of Java Platform i.e., JVM.
* Scala is a strong static type language.
* In scala, everything is an object whether it is a function or a number. 
* Scala does not have support primitive data types.
* Scala was designed by Martin Odersky. 
* Scala was officially released for java platform in early 2004.
* Scala source file having an extension of either .scala or .sc.
* Scala is interactive programming language.
* Scala allows development in two ways:
  * Interactive Mode
  * Standalone
* We can use Scala for developing following type of applications.
  * Web applications
  * Enterprise applications
  * Mobile applications
  * Desktop applications
  * Data Analysis applications
  * Utilities and Libraries
  * Streaming Applications
  * Parallel and batch processing applications
  * etc...
* Scala is crisp, productive and easy to learn.
* Scala is not extension of Java, but it is interoperable with Java.
* Scala is pure object oriented and functional oriented programming language.
* Scala is a pure object oriented language in the sense that every value is an object
* Scala is pure functional language in the sense that every function is a value.

#### Scala Hello World Progrom:
```
  Interactive Mode using scala, scala notebook, zeppelin etc...
  
     println("Hello World")
     
  Standalone Mode:
  
  object HelloWorld {
    def main(args:Array[String]) {
       println("Hello World")
    }
  }
```
**************
## Scala Features:
* Type inference: Scala offers Type Inference i.e., no need to provide the data type explicitly
* Singleton objects: Scala offers Singleton i.e., no static members.
* Immutability: Scala offers Immutability i.e., can not modify variable values.
* Lazy computation: Scala offers Lazy computation i.e., it evaluates expressions only when they are required.
* Case classes and Pattern matching: Scala case classes are regular classes but there are immutable. Scala case classes are used in combination with Scala pattern matching.
* Concurrency control: Scala provides actor model for better handling of Concurrency.
* String interpolation: Scala String interpolation allows embedding variables as part of Scala string.
* Higher order function: Scala offers high order functions i.e., function takes another function as argument or function returns another function as return value.
* Traits: Scala provides trait which contains fields and methods of type abstract and non abstract.
* Rich collection set: Scala provides a rich set of mutable and immutable collections to manipulate the data.
* Closures: Scala offers ananymous functions
* etc...


********************
## Scala Variables and Data Types
* Scala allows two types of variables i.e., val and var
* val is constant i.e., immutable
* var is modifiable i.e., mutable.

```
val name = "Naga"
name = "Ravi" // This throws error

var age = 30
age = 35 // This works
```
* The following are standard data types in Scala which are similar to Java. The only difference is which are Objects rather than primitives.
  * Byte
  * Short
  * Int
  * Long
  * Float
  * Double
  * String
  * Char
  * Boolean
  * Null
  * Nothing
  * Any
  * AnyRef
  * AnyVal
  * etc...

*******************
## Scala Control structures:
* Scala offers the following control structures which are used control flow of Scala program.
  * Conditional Statements
    * if, if-else, nested if-else, if-else ladder
  * Scala Pattern Matching
  * Scala loops

#### Conditional Statements:
##### if-statement
```
   Syntax:
   if(<condition>){
    statements...
   }
```
##### if-else statement
```
if(<condition>){
 statements...
}else{
 statements....
}
```
##### if-else ladder
```
if(<condition>){
 statements...
}else if(<condition>){
 statements....
}else if(<condition>){
 statements..
}else{
 statements....
```
*Note: Use Ternary operator instead of if-else statements i.e., ```<condition> ? <true case> : <false case>```*
#### Scala Pattern Matching:
* Scala pattern matching is alternative to switch statement.
```
variable match {
case 1 => statements
case 2 => statements
case 3 => statements
case _ => statements
}
```
#### Loops
* while loop
* do while loop
* for loop
```
while loop:

while(<condition>){
 statements
}

do-while loop:

do{
 statements
}while(<Condition>)

for loop:

for(i <- range){
 statements
}

for(i <- ScalaCollection){
 statements...
}
```

*********************
## Scala Comments
* Scala supports thre types of comments
  * Single line ```//```
  * Multi line ```/*....*/```
  * Documentation ```/** **** */```
  
***************
## Scala Functions
* Scala supports functional programming
* Scala has lot of builtin functions and also supports for user defined functions.
* Scala Functions are first class values.
* Store Scala Function as value
* Every value in Scala is an Object i.e., Scala function also an Object.
* Scala allows passing a function as method/function argument and return function as another function return value.
* Scala functions are defined with keyword *def* like in Python and Ruby.

#### Scala Function Definition:
```
def functionName([funcParams : typeofparameters]) : [returntypeoffunction] = {  
statements...
[(return_value)]
}
```
