package ex_string_builder_class


fun main() {
    val builder = StringBuilder().append("2018").append("PyeongChang").append("Olympic")
    val result = builder.toString()
    println(result)
}