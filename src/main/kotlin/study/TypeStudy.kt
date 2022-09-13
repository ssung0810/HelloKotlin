package study

class TypeStudy {
//    val smallType: Int = 1
//    val bigType: Long = smallType

    val smallType: Int = 1
    val bigType: Long = smallType.toLong()

    val testVal = 1;
}

class ChangeObject {
    fun isAny(obj: Any) {
        if(obj is TypeStudy) {
            val typeStudy = obj as TypeStudy
            typeStudy.testVal
        }
    }

    fun isAny2(obj: Any?) {
        val typeStudy = obj as? TypeStudy// ?: ChangeObject()
        println(typeStudy?.testVal)
    }
}

fun main() {
    val changeObject = ChangeObject()
}