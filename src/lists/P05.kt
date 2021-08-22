package lists

fun <T> reverse(list: List<T?>): List<T?>{
    if(list.size<=1) {
        return list
    }else{
        return list.reversed()
    }
}

fun main(){
    println(reverse(listOf(1, 1, 2, 3, 5, 8)))
}