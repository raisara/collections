package lists

fun range(start: Int, finish: Int): List<Int>{
    val list = mutableListOf<Int>()
    for(i in start..finish){
        list.add(i)
    }
    return list
}

fun main(){
    println(range(4, 9))
}