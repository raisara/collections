package lists

fun <T> encodeModified(list: List<T?>): List<Any?> {
    return pack(list).map{
        if(it.size==1) it.first()
        else it.size to it.first()
    }
}

fun main(){
    println(encodeModified("aaaabccaadeeee".toList()))
}