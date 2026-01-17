fun main() {
    val num = mutableListOf<Int>()
    for(i in 1..5){
        val input = readLine()!!.toInt()
        num.add(input)
    }
    val even = num.filter { it % 2==0 }
    println("${even.size} valores pares")
}