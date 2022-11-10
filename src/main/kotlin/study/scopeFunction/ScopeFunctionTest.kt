package study.scopeFunction

class ScopeFunctionTest(
    val name: String = "dael"
)

fun main() {
    val obj = ScopeFunctionTest()

    val value1: String = obj.let { it.name }
    val value2: String = obj.run { this.name }
    val value3: ScopeFunctionTest = obj.also { it.name }
    val value4: ScopeFunctionTest = obj.apply { this.name }
}
