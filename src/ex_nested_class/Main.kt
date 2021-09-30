package ex_nested_class

class Outer{
    class Nested{
        fun hello()=println("중첩된 클래스")
    }
}
fun main() {
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}