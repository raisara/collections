package lists

fun <T> duplicate(list: List<T?>): List<T?>{
    return list.flatMap{ listOf(it, it) }
}

fun main(){
    println(duplicate("abccd".toList()))
}