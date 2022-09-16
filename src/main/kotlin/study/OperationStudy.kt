package study

class OperationStudy {
}

class Wallet(val amount: Int, val isMine: Boolean)

data class MyWallet(private val amount: Int) {
operator fun plus(myWallet: MyWallet): MyWallet {
        return MyWallet(this.amount + myWallet.amount)
    }
}

fun main() {
//    val wallet1 = Wallet(1000, true)
//    val wallet2 = Wallet(1000, true)
//
//    println( wallet1 + wallet2 )

    val myWallet1 = MyWallet(1000)
    val myWallet2 = MyWallet(1000)

    println( myWallet1 + myWallet2 )
}