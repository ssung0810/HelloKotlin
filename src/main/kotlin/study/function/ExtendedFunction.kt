package study

class ExtendedFunction(val num1: Int, val num2: Int) {

    // 멤버 변수
    fun addNum(): Int {
        println("멤버 변수")
        return num1 + num2
    }

    fun randomNum(): Int {
        return num1 - num2
    }
}

// 확장 함수
val ExtendedFunction.multipleNum: Int
    get() = num1 * num2

fun ExtendedFunction.randomNum(): Int {
    println("확장 함수")
    return num1 + num2
}

fun main() {
    val extendedFunction = ExtendedFunction(2, 5)

//    println( extendedFunction.randomNum() )
//    println( extendedFunction.addNum() )
//    println( extendedFunction.multipleNum() )
    println( extendedFunction.multipleNum )

//    val dog: Dog = Dog()
//    val dog2: Dog = Maltese()
//    val maltese: Maltese = Maltese()
//
//    println( dog.getOwner() )
//    println( dog2.getOwner() )
//    println( maltese.getOwner() )
}

open class Dog {

}

class Maltese() : Dog() {

}

fun Dog.getOwner() {
    println("Dog 확장 함수")
}

fun Maltese.getOwner() {
    println("Maltese 확장 함수")
}

