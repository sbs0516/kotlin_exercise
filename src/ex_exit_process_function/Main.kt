package ex_exit_process_function

import kotlin.system.exitProcess

fun something(num:Int){
    if(num<0)
        exitProcess(0)
}
fun main() {
    something(-1)
    println("Hello")
}