package lists

fun <T> nth(n: Int, list: List<T?>): T?{
    if(list.all {it == null}) {
        return null
    }else{
        return list[n];
    }
}

fun main(){
    println(nth(2, listOf(1, 1, 2, 3, 5, 8)))
}