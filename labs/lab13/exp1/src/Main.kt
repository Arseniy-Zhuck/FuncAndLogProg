import java.lang.System.`in`
import java.util.*


fun sumelem(num:Int) : Int = if (num == 0) 0 else (num % 10) + sumelem(num / 10)
fun mulelem(num:Int) : Int = if (num == 0) 1 else (num % 10) * mulelem(num / 10)
//fun maxelem(num:Int,max:Int):Int = if(num<10) max=num else if(num%10>max) maxelem(num/10,num%10) else maxelem(num/10,max)

fun maxelem(num:Int):Int
{
    var max = num%10
    var i = num/10

    while(i!=0){
      if(i%10>max) max = i%10
      i/=10
    }

    return max
}

fun minelem(num:Int):Int
{
    var min = num%10
    var i = num/10

    while(i!=0){
        if(i%10<min) min = i%10
        i/=10
    }

    return min
}

fun prost(chislo : Int) : Boolean
{
    if (chislo == 1) return false
    for(i in 2..chislo-1)
        if (chislo % i == 0) return false
    return true
}

fun del(chislo : Int) : Int
{
    var sum = 0
    for(i in 1..chislo)
        if((chislo % i == 0) && prost(i))
            sum += i
    return sum
}
fun main() {
    val scanner = Scanner(`in`)
    var s = scanner.nextInt()
    var sum = 0

    println("Прстое число : "+prost(2))
    println("Сумма цифер : "+sumelem(s))
    println("Произведение цифер : "+mulelem(s))
    println("Максимальный элемент : "+maxelem(s))
    println("Минимальный элемент : "+minelem(s))
    println("${del(s)}")
}