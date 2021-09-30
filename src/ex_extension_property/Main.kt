package ex_extension_property

val String.isLarge: Boolean
get() = this.length>=10
fun main() {
    println("1234567890".isLarge)
    println("500원".isLarge)
}
