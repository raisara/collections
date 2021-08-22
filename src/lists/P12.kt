package lists

fun <T> decode(list: List<Pair<Int, T>>): List<T>{
    return list.flatMap { (size, value) -> List(size) {value} }
}

fun main(){
    println(decode(listOf(Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e'))))
}
