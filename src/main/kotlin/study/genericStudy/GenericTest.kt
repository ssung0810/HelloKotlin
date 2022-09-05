package study.genericStudy

import java.util.Arrays
import kotlin.jvm.internal.FunctionReferenceImpl

class GenericTest {
}

//fun receiveFruits(fruit: Array<Fruit>) {
//    fruit[0] = Banana()
//}
//
//fun main() {
//    val fruits: Array<Apple> = arrayOf(Apple())
//    receiveFruits(fruits)
//}

//fun main() {
//    val fruits: List<Apple> = listOf(Apple())
//    receiveFruits(fruits)
//}
//
//fun receiveFruits(fruits: List<Fruit>) {
//    println("Number of fruits: ${fruits.size}")
//}

fun main() {
    val fruitBasket1 = Array<Apple>(3) { _ -> Apple() }
    val fruitBasket2 = Array<Any>(3) { _ -> Any() }
//    copyFromTo(fruitBasket1, fruitBasket2)
}

fun <T> copyFromTo(from: Array<out Fruit>, to: ArrayList<in Fruit>) {
    to[0] = Apple()
    for (i in from.indices) {
        to[i] = from[i]
    }
}
