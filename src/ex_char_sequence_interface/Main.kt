package ex_char_sequence_interface

fun main() {
    val seq:CharSequence = "Hello"
    println(seq.length)
    println(seq.get(3))
    println(seq.subSequence(1,4))
}