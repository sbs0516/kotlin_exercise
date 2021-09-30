package ex_kotlin_version

fun main() {
    val kotlinVersion:KotlinVersion = KotlinVersion.CURRENT
    println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}")
    println(kotlinVersion.isAtLeast(1,1,0))
}