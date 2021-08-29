fun <T> lengthSort(list: List<List<T>>): List<List<T>> = list.sortedBy{it.size}

fun <T> lengthFreqSort(list: List<List<T>>): List<List<T>>{//List<List<T>>
    val grouped = list.groupBy{it.size}// {3=[[a, b, c], [f, g, h]], 2=[[d, e], [d, e], [m, n]], 4=[[i, j, k, l]], 1=[[o]]}
    return list.sortedBy { grouped.getValue(it.size).size}
}


fun main(){
    //println(lengthSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(), "mn".toList(), "o".toList())))
    println(lengthFreqSort(listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(), "mn".toList(), "o".toList())))
}