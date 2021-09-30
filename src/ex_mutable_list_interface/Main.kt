package ex_mutable_list_interface

fun main() {
    val list:MutableList<Char> = mutableListOf('c','a','z')
    println(list)

    list.add('b')
    println(list)

    list.addAll(2,listOf<Char>('g','d','i'))
    println(list)

    list.removeAt(3)
    println(list)

    list.set(0,'p')
    println(list)
}