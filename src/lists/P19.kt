package lists

fun <T> rotate(n: Int, list: List<T>): List<T>{
    //val splited = split(n, list)
    //val firstPart = splited[1]
    when {
        n == 0 -> return list
        n > 0  -> return list.drop(n) + list.take(n)
        else   -> return list.takeLast(-n) + list.dropLast(-n)
    }

}

fun main(){
    println(rotate(3, "abcdefghijk".toList()))
    println(rotate(-2, "abcdefghijk".toList()))
}