package test

import java.lang.StringBuilder

fun main() {
    val orderIdList = listOf("출발지", "경유지", "도착지")
    println( orderIdList.joinToString("\n> ") )
}

class StringListTest {

}