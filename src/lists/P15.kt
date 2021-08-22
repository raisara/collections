package lists

fun <T> duplicateN(n: Int, list: List<T?>): List<T?>{
    return list.flatMap{ value -> List(n) {value} }
}

fun main(){
    println(duplicateN(3, "abccd".toList()))
}