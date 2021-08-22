package lists

fun <T, K> insertAt(newElement: T, index: Int, list: List<K>): List<*> =
    list.take(index) + newElement + list.drop(index)

fun main(){
    println(insertAt('X', 1, "abcd".toList()))
}