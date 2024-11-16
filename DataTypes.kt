fun main() {
  
  // 1. Numeric Types
  val myByte: Byte = 100
  val myShort: Short = 10000
  val myInt: Int = 1_000_000
  val myLong: Long = 1_000_000_000L // Use 'L' for Long literals
  val myFloat: Float = 3.14F // Use 'F' for Float literals
  val myDouble: Double = 3.14159265358979

   // 2. String Type
  val message: String = "Hello, Kotlin!"
  val name = "Alice"
  val greeting = "Hello, $name!" // String interpolation
  val lengthMessage = "Your name has ${name.length} letters."
  
  // 3. Boolean Type
  val isKotlinFun: Boolean = true
  val isKotlinFun2: Boolean = false

  // 4. Character Type
  val letter: Char = 'A'

  
  // 5. Array Types
  val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
  val mixedArray = arrayOf(1, "Kotlin", true) // Can hold mixed types


  // 6. Collection Types
  val numbersList: List<Int> = listOf(1, 2, 3)
  val uniqueSet: Set<String> = setOf("A", "B", "C")
  val keyValueMap: Map<String, Int> = mapOf("Alice" to 25, "Bob" to 30)

  // 7. Null Types
  val nonNullable: String = "Hello" // Cannot be null
val nullable: String? = null      // Can be null

  // 8. Any, Unit, and Nothing
  val anything: Any = "This can be anything!"
  
  fun sayHello(): Unit {
    println("Hello!")
}

  fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

// 9. ----- Special Data Types -----

// A. enum
enum class Direction { NORTH, SOUTH, EAST, WEST }
val direction = Direction.NORTH

  // B. Sealed Classes
sealed class Result
data class Success(val data: String) : Result()
object Failure : Result()

// C. Data Classes
data class User(val name: String, val age: Int)
val user = User("Alice", 25)


// 10. Type Conversion
val num = 10
val converted: Long = num.toLong()
  
}






