package ex_mutable_map_interface

fun main() {
    val map:MutableMap<String,String> = mutableMapOf()
    println(map)

//    println(map.put("인사","Hi"))
//    println(map)

    println(map.put("작별","Bye"))
    println(map)

    map["인사"]="Hello"
    println(map)

    println(map.putAll(mapOf("메롱" to "merong", "안녕" to "잘지내")))
    println(map)

    println(map.remove("인사"))
    println(map)

    map["인사"]="hi"
    println(map)
    println(map.remove("인사","hi"))
    println(map)

    println(map.remove("인사","hello"))
    println(map)

    println(map.clear())
    println(map)
}