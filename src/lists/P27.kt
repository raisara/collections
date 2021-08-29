fun <T> group3(list: List<T>): List<List<List<T>>> =
    combinations(2, list).flatMap { listOfTwo ->
        val filteredList = list.filterNot { listOfTwo.contains(it) }
        combinations(3, filteredList).flatMap { listOfThree ->
            val filteredList2 = filteredList.filterNot { listOfThree.contains(it) }
            combinations(4, filteredList2).map { listOf(it, listOfThree, listOfTwo) }
        }
    }


fun main(){
    println(group3(listOf("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
}