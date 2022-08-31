package study

class ClassStudy(
    val name: String = "dael",
    val age: Int = 1
) {
    init {
        if (age <= 0) {
            throw IllegalStateException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }
//
//    constructor(name: String): this(name, 1){
//        println("부생성자 1")
//    }
//
//    constructor(): this("dael") {
//        println("부생성자 2")
//    }
}

fun main() {
    val classStudy = ClassStudy(age = 2)
    println("${classStudy.name} / ${classStudy.age}")
}
