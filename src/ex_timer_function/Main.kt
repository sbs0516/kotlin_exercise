package ex_timer_function

import java.util.*
import kotlin.concurrent.timer

fun main() {
    var i=1
    var t: Timer = timer(initialDelay = 1500, period = 250){
        println(i)
        i+=1
    }
    Thread.sleep(2400)
    t.cancel()
}