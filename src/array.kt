fun main(){
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    println(arr.joinToString())
    for (i in arr.indices) {
        println("$i -> ${arr[i]}")
    }

}