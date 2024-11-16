fun main() {
    
    val word = "ahmed"
    when (word) {
        "ahmed" -> println("Right")
        "muhmmad" -> println("Wrong")
        else -> println("None")
    } // OutPut Right

    println("-----") // Separation between both switch.

    val number = 247
    when (number) {
        247 -> println("Right")
        100 -> println("Wrong")
        else -> println("None")
    } // OutPut Right
}
