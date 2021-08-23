package lists

fun <T> encodeDirect(list: List<T?>): List<Pair<Int, T?>>{
    val myList = mutableListOf<Pair<Int, T?>>()
    var element: T? = list[0]
    var count = 1
    for(i in 0..list.size-2){
        if(list[i]==list[i+1]){
            count++
        }else{
            myList.add(count to element)
            element=list[i+1]
            count = 1
        }
    }
    myList.add(count to element)
    return myList
}

fun main(){
    println(encodeDirect("aaaabccaadeeee".toList()))
}
