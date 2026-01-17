fun main() {
    val num =mutableListOf<Double>()
    for(i in 1..6){
        val input = readLine()!!.toDouble()
        num.add(input)
    }
    val pos = num.filter { it>0 }
    println("${pos.size} valores positivos")
    val avg =pos.average()
    println("%.1f".format(avg))
}