package test

import java.util.*

class EnumTest {


    enum class Type(name: String) {
        NICE("nice"), CASH("cash"), POINT("point");
    }
}

fun main() {
//    val method = "nice"
//
//    val valueOf = EnumTest.Type.valueOf(method)
//    println( valueOf )
//
//    val nice = EnumTest.Type.NICE

//    val values = EnumTest.Type.values()
//    values.map { println(it) }

    println( UUID.randomUUID().toString().substring(0,8) )
}