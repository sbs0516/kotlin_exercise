package ex_with_extension_function

fun main() {
    val a = 3
    val b = 7
    with(a*a-b*b){
        println(this)
        println(-this)
    }
}