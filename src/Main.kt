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

    println("\nЗадание 3")
    println("Число -10 отрицательное: ${isNegative(-10)}")
    println("Число 10 отрицательное: ${isNegative(10)}")
    println("Число 0 отрицательное: ${isNegative(0)}")

    println("\nЗадание 4")
    printNumberSign(-10)
    printNumberSign(10)
    printNumberSign(0)
}

// Задание 2. Написать метод, которому в качестве параметра передается строка,
// обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
private fun printGreeting(name: String) {
    println("Привет, $name!")
}

// Задание 3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
private fun isNegative(number: Int): Boolean {
    return number < 0
}

// Задание 4. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
private fun printNumberSign(number: Int) {
    if (number > 0) {
        println("Число $number положительное")
    } else if (number < 0) {
        println("Число $number отрицательное")
    } else {
        println("Число равно нулю")
    }
}