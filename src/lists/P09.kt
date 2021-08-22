package lists

fun <T> pack(list: List<T?>): List<List<T?>>{
    if(list.isEmpty()) {
        return emptyList()
    }else{
        //return list.groupBy{it}.values
        val packed = list.takeWhile{it == list.first()}
        return listOf(packed) + pack(list.drop(packed.size))
    }
}

fun main(){
    println(pack("aaaabccaadeeee".toList()))
}