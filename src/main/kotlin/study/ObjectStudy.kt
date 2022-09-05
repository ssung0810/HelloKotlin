package study

import java.util.Objects

class ObjectStudy {
}

class Food(
    private val food: String
) {
    companion object {
        const val FOOD = "국밥"

        fun lunchChoice(food: String) {
            println(food)
        }

        fun dessertChoice(food: String) {
            println(food)
        }
    }

    fun dinnerChoice() {
        println(this.food)
    }
}

class Money{
    object MoneyBox {
        private var money: Int = 0

        fun savingMoney(money: Int) {
            println("현재 저금된 금액 : ${money}")
        }
    }
}

fun main() {
    Food("피자").dinnerChoice()               // 일반 함수 호출
    Food.Companion.lunchChoice("치킨")        // 상수 함수 호출
    Food.dessertChoice("빙수")                //
    println(Food.FOOD)

    Money.MoneyBox.savingMoney(1000)
}