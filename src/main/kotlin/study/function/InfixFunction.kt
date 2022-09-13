package study.function

class InfixFunction(val num1: Int, val num2: Int) {
}

infix fun InfixFunction.addNum(num3: Int): Int {
    return num1 + num2 + num3
}

fun main() {
    val infixFunction = InfixFunction(2, 5)

    println( infixFunction.addNum(1) )
    println( infixFunction addNum 1 )
}