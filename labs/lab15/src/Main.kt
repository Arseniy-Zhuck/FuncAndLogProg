import java.util.*

fun main() {
    val ar : Array<Int> = Array(3) { i -> i}
    ar.forEach { el -> ar[el] = el*el }
    println(ar.joinToString { el -> el.toString() })



}