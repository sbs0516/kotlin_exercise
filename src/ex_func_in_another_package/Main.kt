package ex_func_in_another_package
import ex_package.max
import ex_package.abs as avg
import ex_package.min

fun main() {
    println(min(30,10))
    println(max(40,50))
    println(avg(10))
}