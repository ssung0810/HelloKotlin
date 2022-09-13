package study.function

class FunctionStudy {

}

fun main() {
    manyParameter("iphone", "galaxy")

    val array = arrayOf("iphone", "galaxy")
    manyParameter(*array)
}

fun manyParameter(vararg names: String) {
    for (name in names) {
        println(name)
    }
}

fun writeOfName(
    name: String,
    num: Int = 3,
    enter: Boolean = true
) {
    for (i in 1..num) {
        if(enter) {
            println(name)
        } else {
            print(name)
        }
    }
}

fun study(a: Int, b: Int) = if(a > b) a else b
