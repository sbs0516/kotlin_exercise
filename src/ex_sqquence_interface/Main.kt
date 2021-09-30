package ex_sqquence_interface

fun main() {
    val seq:Sequence<Int> = sequenceOf(1,2,3)

    for(i in seq)
        print("$i ")
}