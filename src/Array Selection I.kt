fun main(args: Array<String>) {
    for(i in 0 until 100){
        val n = readLine()!!.toDouble()
        val ans ="%.1f".format(n)
        if(n<=10.0){
            println("A[$i] = $ans")
        }
    }
}