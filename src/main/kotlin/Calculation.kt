fun main() {

    println("Welcome to the calculation game")

    // User input
    print("Enter what calculation you want to perform: '+', '-', '/', '*': ")
    val sign = readLine()

    if (sign == "+") {
        // Reading an input
        print("Enter the first number: ")
        val num1Str = readLine()

        print("Enter the second number: ")
        val num2Str = readLine()

        // Convert strings to floats
        val num1 = num1Str?.toIntOrNull() ?: 0
        val num2 = num2Str?.toIntOrNull() ?: 0
        val add = addition(num1, num2)
        println(add)

    }

    if (sign == "-") {
        print("Enter the first number: ")
        val num1Str = readLine()

        print("Enter the second number: ")
        val num2Str = readLine()

        // Convert strings to int
        val num1 = num1Str?.toIntOrNull() ?: 0
        val num2 = num2Str?.toIntOrNull() ?: 0
        val subtract = subtraction(num1, num2)
        println(subtract)

    }


    if (sign == "/") {
        print("Enter the first number: ")
        val num1Str = readLine()

        print("Enter the second number: ")
        val num2Str = readLine()

        // Convert strings to int
        val num1 = num1Str?.toIntOrNull() ?: 0
        val num2 = num2Str?.toIntOrNull() ?: 0
        val divide = division(num1, num2)
        println(divide)

    }

    if (sign == "*") {
        print("Enter the first number: ")
        val num1Str = readLine()

        print("Enter the second number: ")
        val num2Str = readLine()

        // Convert strings to int
        val num1 = num1Str?.toIntOrNull() ?: 0
        val num2 = num2Str?.toIntOrNull() ?: 0
        val multiply = multiplication(num1, num2)
        println(multiply)

    }



}

fun addition( firstNum: Int, secondNum: Int): Int{
    return firstNum + secondNum
}

fun subtraction( firstNum: Int, secondNum: Int): Int{
    return firstNum - secondNum
}

fun multiplication( firstNum: Int, secondNum: Int): Int{
    return firstNum * secondNum
}

fun division( firstNum: Int, secondNum: Int): Int{
    if (secondNum == 0){
        println("Error: Division by zero is not allowed. Please try again")
        return -1
    }
    return firstNum / secondNum
}