package ex_collection_sorted

fun main() {
//    val list = listOf<Int>(43,76,28,19,22,68)
//
//    println(list.sorted())
//    println(list.sortedDescending())
//    println(list.sortedBy {
//        it.toFloat()
//    })
//    println(list.shuffled())

    val lotto = 1..45
    println(lotto.shuffled().subList(0,6).sorted())
}