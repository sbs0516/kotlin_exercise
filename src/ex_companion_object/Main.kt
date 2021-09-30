package ex_companion_object

class Person private constructor(){
    companion object{
        fun create(): Person{
            countCreated+=1
            return Person()
        }
        var countCreated=0
        private set
    }
}
fun main() {
    val a=Person.create()
    val b=Person.Companion.create()
    println(Person.countCreated)
}