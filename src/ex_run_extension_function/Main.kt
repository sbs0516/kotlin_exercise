package ex_run_extension_function

fun main() {
    val a = 10
    val b = 5

    (a*b-2*a).run{
        if(this>0)
            println(this)
    }
}