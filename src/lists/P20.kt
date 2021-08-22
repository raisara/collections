package lists

fun <T> removeAt(k: Int, list: List<T>): Pair<List<T>, T>{
    val list = list.toMutableList()
    val removed = list.removeAt(k)
    return Pair(list, removed)

    //return Pair(list.filterIndexed{index, _ -> index!=k}, list[k])
}

fun main(){
    println(removeAt(1, "abcd".toList()))
}