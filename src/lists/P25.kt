package lists

fun <T> randomPermute(list:List<T>): List<T> = randomSelect(list.size, list)

fun main(){
    println(randomPermute("abcdef".toList()))
}