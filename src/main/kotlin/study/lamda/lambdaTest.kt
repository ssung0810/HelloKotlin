package study.lamda

class Fruit(
    val name: String,
    val price: Int
)

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )

    val isApple = fun (fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    println( filterFruits(fruits, isApple).size )
    println( filterFruits(fruits, isApple2).size )
    println( filterFruits(fruits){ it.name == "사과" }.size )
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter { fruit -> filter(fruit) }
}