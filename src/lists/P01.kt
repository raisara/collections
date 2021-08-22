package lists

fun <T> last(list: List<T?>): T?{
    if(list.all {it == null}) {
        return null
    }else{
        return list.last()
    }
}

fun main(){
    println(last(listOf(1, 1, 2, 3, 5, 8)))
    println(last(listOf("a", "b", "c")))
    println(last(listOf()))
}