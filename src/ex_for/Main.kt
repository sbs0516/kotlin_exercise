package ex_for

fun main() {
    for(i: Int in 1..10)
        print("$i")
    println()

    for(i: Int in 1..10){
        if(i>5)
            break
        print("$i")
    }
}