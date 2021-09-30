package ex_destructing_object

data class Employee(val name:String, val age:Int, val salary:Int)

fun main() {
    val(name,_,salary)=Employee("John",30,3000)
    val(_,age,_)=Employee("John",30,3000)
    println(name)
    println(salary)
    println(age)
}