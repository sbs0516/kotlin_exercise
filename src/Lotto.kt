import java.util.*

fun main() {
    Random().ints(1,6).limit(1).forEach(System.out::println)
    Random().ints(0,10).limit(6).forEach(System.out::println)
}