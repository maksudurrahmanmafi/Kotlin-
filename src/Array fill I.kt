fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    for(i in 0..9){
        println("N[$i] = $n")
        n*=2
    }
}