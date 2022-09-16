package study

class TypeStudy {
    val smallType: Int = 1
}

class ChangeObject {
    fun isAny(obj: Any?) {
        val any = obj as? TypeStudy ?: EtcObject()
    }
}

class EtcObject {

}

fun main() {
    val changeObject = ChangeObject()

    val resultObj1 = changeObject.isAny(TypeStudy())
    val resultObj2 = changeObject.isAny(ChangeObject())          // ClassCastException
    val resultObj3 = changeObject.isAny(null)               // NullPointerException

//    println( resultObj1?.smallType )
//    println( resultObj2?.smallType )
//    println( resultObj3?.smallType )
}