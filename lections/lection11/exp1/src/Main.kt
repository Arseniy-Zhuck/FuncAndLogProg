class Client1(val name : String, val postalCode : Int)
data class Client(val name : String, val postalCode : Int)
fun main() {
    val c1 = Client1("Petr",4)
    val c2 = c1.copy()
    println(c1 == c2)
    println(c1 === c2)

    val client1 = Client("Ivan",3)
    val client2 = client1.copy()
    println(client1 == client2)
    println(client1 === client2)
}

private fun Client1.copy(): Any {
    return Client1(name, postalCode)
}