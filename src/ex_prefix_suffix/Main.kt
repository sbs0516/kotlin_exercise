package ex_prefix_suffix

fun main() {
    val str:CharSequence = "http://www.naver.com"
    println(str.startsWith("http://"))
    println(str.endsWith(".com"))
    println(str.removePrefix("http://"))
    println(str.removeSuffix(".com"))
    println(str.removeSurrounding("http://",".com"))
}