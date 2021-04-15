import java.util.*





fun main() {
    val shopping = listOf("Tea", "Eggs", "Milk")
    val numbList = mutableListOf<Int>(2,3,4,5,2,3,3,2,2,3)

//    for (numb in numbList)
//        if (numb == 2) numbList.remove(2)
//    print(numbList)
      val iter : MutableIterator<Int> = numbList.iterator()
      while (iter.hasNext()) {
        val numb = iter.next()
        if (numb == 2) iter.remove()
        
      }
    print(numbList)
    


    

}


