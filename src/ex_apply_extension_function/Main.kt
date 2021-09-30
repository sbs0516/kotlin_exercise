package ex_apply_extension_function

class Person{
    var name:String = ""
    var age:Int = 0
    var money:Int = 0

    override fun toString(): String = "$name $age $money"
}
fun main() {
    println(
            Person().apply {
                this.name="Alan"
                this.money=70
            }
    )
}