package lists

fun <T> length(list: List<T?>): Int{
    if(list.isEmpty()) {
        return 0
    }else{
        return list.size;
    }
}

fun main(){
    println(length(listOf(1, 1, 2, 3, 5, 8)))
    //println(length(listOf()))
    println(length(listOf(null)))
}