package ex_to_list

fun main() {
    val list: List<Int> = Pair(10,20).toList()
    val list2:List<Double> = Triple(.1,6.25,8.15).toList()

    println(list)
    println(list2)
}