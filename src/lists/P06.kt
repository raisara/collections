package lists

fun isPalindrome(list: List<Int>): Boolean = if(list==reverse(list))  true else false

fun main(){
    println(isPalindrome(listOf(1, 2, 3, 2, 1)))
    println(isPalindrome(listOf(1, 2, 2, 1)))
    println(isPalindrome(listOf(1, 2, 3, 2, 9)))
    println(isPalindrome(listOf()))
    println(isPalindrome(listOf(1)))
}