fun main() {
    // Задание 1. Создать переменные всех пройденных типов данных и инициализировать их значения.
    val byteValue: Byte = 100
    val shortValue: Short = 30000
    val intValue: Int = 100000
    val longValue: Long = 3000000000L
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.1415926535
    val charValue: Char = 'А'
    val booleanValue: Boolean = true
    val stringValue: String = "Kotlin"

    println("Byte: $byteValue")
    println("Short: $shortValue")
    println("Int: $intValue")
    println("Long: $longValue")
    println("Float: $floatValue")
    println("Double: $doubleValue")
    println("Char: $charValue")
    println("Boolean: $booleanValue")
    println("String: $stringValue")

    println("\nЗадание 2")
    printGreeting("Евгений")
}

// Задание 2. Написать метод, которому в качестве параметра передается строка,
// обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
private fun printGreeting(name: String) {
    println("Привет, $name!")
}