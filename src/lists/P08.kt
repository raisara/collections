package lists

fun <T> compress(list: List<T?>): MutableList<T?>{//: Set<T?> {
    //return list.toSet()
    var newList = mutableListOf<T?>()
    //for(i in list.indices-1){
        for(i in 0..list.size-2){
            if(list[i]==list[i+1]) continue
            else{
                newList.add(list[i])
            }
        }

    return newList
}

fun main(){
    println(compress("aaaabccaadeeee".toList()))
    println(compress("faa456Acaadeeee".toList()))
    println(compress("".toList()))
}