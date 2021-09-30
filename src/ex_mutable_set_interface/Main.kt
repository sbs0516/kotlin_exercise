package ex_mutable_set_interface

fun main() {
    val set:MutableSet<Int> = mutableSetOf(1,5,7)
    println(set)

    println(set.add(3))
    println(set)

    println(set.remove(1))
    println(set)

    println(set.addAll(listOf(9,6,7)))
    println(set)
}