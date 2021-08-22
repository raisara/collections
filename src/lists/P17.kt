package lists

fun <T> split(length: Int, list: List<T?>): Pair<List<T?>, List<T?>> = Pair(list.take(length), list.drop(length))

fun main(){
    println(split(3, "abcdefghijk".toList()))
}