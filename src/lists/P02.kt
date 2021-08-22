package lists

fun <T> penultimate(list: List<T?>): T?{
    if(list.size<2 || list.all {it == null}) {
        return null
        //throw Exception("The element must contain at least 2 elements")
    }else{
        return list[list.lastIndex-1];
    }
}

fun main(){
    println(penultimate(listOf(1, 1, 2, 3, 5, 8)))
    println(penultimate(listOf("a", "b")))
    println(penultimate(listOf("a")))
    println(penultimate(listOf()))
}