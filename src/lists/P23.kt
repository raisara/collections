package lists

fun <T> randomSelect(n: Int, list: List<T>): List<T>{
    val shuffled = list.shuffled()
    val newList = mutableListOf<T>()
    for(i in 0..n-1){
        newList.add(shuffled[i])
    }
    return newList
    //val newList = mutableListOf<T>().apply { shuffle(n) }
}

fun main(){
    println(randomSelect(3, "abcdefgh".toList()))
}