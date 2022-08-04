class UseSwitch {
}

fun main() {
    val a: Int = 20

    when(a) {
        in 1..10 -> println("1점입니다. :: ${a}")
        else -> println("2점입니다. :: ${a}")
    }
}