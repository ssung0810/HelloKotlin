package study.function

class LocalFunction {

//    fun validationCheck(startDate: String, endDate: String): String {
//        if(startDate.isEmpty()) throw IllegalArgumentException("시작날짜가 잘못됐습니다.")
//        if(endDate.isEmpty()) throw IllegalArgumentException("종료날짜가 잘못됐습니다.")
//
//        return "success"
//    }

    fun validationCheck(startDate: String, endDate: String): String {
        fun validateDate(date: String, name: String) {
            if (date.isEmpty()) throw IllegalArgumentException("${name}날짜가 잘못댔습니다.")
        }
        validateDate(startDate, "시작")
        validateDate(endDate, "종료")

        return "success"
    }
}

fun main() {
    val localFunction = LocalFunction()

    localFunction.validationCheck("", "")
}