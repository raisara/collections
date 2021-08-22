package lists

fun <T> encode(list: List<T?>): List<Pair<Int, T?>>{
    return pack(list).map{it.size to it.first()}
}

fun main(){
    println(encode("aaaabccaadeeee".toList()))
}