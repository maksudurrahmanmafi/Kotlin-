fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for(i in 1..n){
        println("$i ${i*i} ${i*i*i}")
        println("$i ${i*i+1} ${i*i*i+1}")
    }
}