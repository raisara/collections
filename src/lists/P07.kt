package lists

fun flatten(list: List<Any>): List<Any> =
    list.flatMap{
        if(it is List<*>) flatten(it as List<Any>) else listOf(it)
    }


fun main(){
    println(flatten(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))))
}
