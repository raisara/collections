package lists

fun <T> combinations(elements: Int, list: List<T>): List<List<T>>{
    val newList = mutableListOf<List<T>>()
    if(elements != 0){
        for(arrow1 in 0 until list.size-1){
            for(arrow2 in arrow1+1 until list.size){
                for(arrow3 in arrow2+1..list.size){
                    newList.add(listOf(arrow1 as T, arrow2 as T, arrow3 as T))
                }
            }
        }
    }
    return newList
}

fun main(){
    println(combinations(3, "abcde".toList()))
}
