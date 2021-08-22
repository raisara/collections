package lists

fun <T> slice(start: Int, finish: Int, list: List<T?>): List<T?> {
    return list.slice(start..finish-1)
}

fun main(){
    println(slice(3, 7, "abcdefghijk".toList()))
}