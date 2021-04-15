class MyObject(val name : String, var age : Int) : Comparable<MyObject> {
    override fun compareTo(other: MyObject): Int = - age.compareTo(other.age)
    override fun toString(): String = "Name = $name, age = $age"
    override fun equals(other: Any?): Boolean =
            if (other is MyObject) {
                val otherMyObject : MyObject = other as MyObject
                name.equals(otherMyObject.name) && age.equals(otherMyObject.age)
            } else false


    override fun hashCode(): Int = name.hashCode() + age.hashCode()
}