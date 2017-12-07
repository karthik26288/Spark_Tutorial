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
