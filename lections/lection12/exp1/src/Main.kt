fun main() {
    val list1 = listOf(1,2,3,4,5,6)

    val list2 = list1.fold(MutableList(0) { it -> it}, { total, next -> total.add(next)
                                                                                total})
}
