package ex_mutable_list_iterator_interface

fun main() {
    val list= mutableListOf<Int>(1,2,3)
    val iter:MutableListIterator<Int> = list.listIterator()

    println(list)
    println(iter.next())
    println(iter.hasNext())
    println(iter.add(8))
    println(list)

    println(iter.next())
    println(iter.set(7))
    println(list)
    println(iter.remove())
    println(list)
}