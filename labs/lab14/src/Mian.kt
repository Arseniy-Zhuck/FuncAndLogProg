import java.lang.IllegalArgumentException

fun op3(a : Int, b : Int, c : Int, f : (Int, Int) -> Int) = f(f(a,b),c)
fun sum2(a : Int, b : Int) = a + b

fun op2(s : Char) : (Int,Int) -> Int = when (s) {
    '+' -> {a:Int, b:Int -> a+b}
    '*' -> {a:Int, b:Int -> a*b}
    else -> throw IllegalArgumentException("Unknown operation")
}
fun main() {
    val s2 : (Int,Int) -> Int = {a,b -> sum2(a,b)}
    println(op3(1,2,3, s2))
    println(op2('+')(2,3))
    val color = MyEnum.RED
}

