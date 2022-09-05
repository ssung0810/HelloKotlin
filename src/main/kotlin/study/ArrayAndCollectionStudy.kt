package study

class ArrayAndCollectionStudy {
}

fun main() {
    collectionStudy()
}

fun arrayStudy() {
    var array = arrayOf(10, 20, 30)
    var emptyArray = emptyArray<Int>()

    println(array[0])
    println()

    for (i in array.indices) {
        println("인덱스 : $i / 값 : ${array[i]}")
    }

    println()

    array = array.plus(40)
    for ((idx, value) in array.withIndex()) {
        println("$idx, $value")
    }
}

fun collectionStudy() {
    val list = listOf(10, 20, 30)
    val emptyList = listOf<Int>()

//    list[0] = 40

    var mutableList = mutableListOf(100, 200, 300)
    var emptyMutable = mutableListOf<Int>()

    mutableList.add(400)
    emptyMutable.add(500)

    for (i in mutableList) {
        println(i)
    }

    println()

    for (i in mutableList.indices) {
        println("$i ${mutableList[i]}")
    }

    println()

    for ((idx, value) in mutableList.withIndex()) {
        println("$idx $value")
    }
}