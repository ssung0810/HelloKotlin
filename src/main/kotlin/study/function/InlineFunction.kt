package study.function

class InlineFunction(val num1: Int, val num2: Int) {
}

inline fun InlineFunction.addNum(num3: Int): Int {
    return num1 + num2 + num3
}

fun main() {
    val inlineFunction = InlineFunction(2, 5)

    println( inlineFunction.addNum(1) )
}