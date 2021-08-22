package lists

fun lotto(n: Int, to:Int): List<Int>{
    val list = mutableListOf<Int>()
    while(list.size<n){
        val element = (1..to).random()
        list.add(element)
    }
    return list
}

fun main(){
    println(lotto(3, 49))
}