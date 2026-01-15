fun main(){
    val(a,b,c)=readLine()!!.split(" ").map { it.toInt() }

    val arr = listOf(a,b,c)
    val sortedArr = arr.sorted()
    println(sortedArr.joinToString  ("\n"))
    println("\n$a\n$b\n$c")
}