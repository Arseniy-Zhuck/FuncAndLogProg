import java.util.*

fun main() {
    val  array : Array<MyObject?> = Array(3,{el -> null})
    array[0] = MyObject("vasya", 25)
    array[1] = MyObject("kolya", 21)
    array[2] = MyObject("petya", 31)
    val myObject = MyObject("vasya", 25)
    println(array[0] == myObject)
    val setOfMyObj = setOf(array[0],array[1],array[2])
    println(setOfMyObj.contains(myObject))
    val set = setOf(1,2,3)
    println(set.contains(2))
    val set1 = setOf("qqq","eee","rrr")
    val a = "qqq"
    println(set1.contains(a))
}