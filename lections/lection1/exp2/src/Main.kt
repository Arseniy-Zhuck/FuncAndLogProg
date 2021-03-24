fun maxBodyNorm(a: Int, b: Int) : Int {
    var max = a
    if (a > b) max = a else max = b
    return max
}

fun maxBodyExp(a : Int, b : Int) : Int {
    var max = if (a > b) a else b
    return max
}

fun maxBodyExpShort(a : Int, b : Int) : Int {
    return if (a > b) a else b
}

fun maxExp(a : Int, b : Int) : Int = if (a > b) a else b

fun maxExpTypeInference(a : Int, b : Int) = if (a > b) a else b

fun varAndValDeclaration() : Unit {
    val question = "The Ultimate Question of Lifе , the Universe , and Everything"
    val answer = 42 // typeInference
    val reaction : String = "AAAAAA, what????"
    val yearsToCompute = 7.5e6 // Double
    val anotherQuestion : String
    anotherQuestion = "So, what's the question?"
    question = "mmmmm" + yearsToCompute + "years to compute"

}

class Person(val name : String, var age : Int) {
    val canBeServed : Boolean
    get () {
        return age > 18
    }

    var mobile : String
    get () {
       return mobile
    }
    set (str : String) {
        mobile = if (isMobile(str)) makeMobile(str) else ""
    }

    fun isMobile(str : String) : Boolean = true
    fun makeMobile(str : String) : String = str
}

fun main() {

    val vasya = Person("Vasya", 25)
    vasya.age += 1 // ВЫЗОВ СЕТТЕРА И ГЕТТЕРА
    vasya.name = "Petya" // попытка вызвать сеттер, но он отсутствует

    println(maxBodyNorm(5,3))
    println(maxBodyExp(5,3))
    println(maxBodyExpShort(5,3))
    println(maxExp(5, 3))
    println(maxExpTypeInference(5, 3))

}