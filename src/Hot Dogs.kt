fun main(args: Array<String>) {
    val(a,b)=readLine()!!.split(" ").map { it.toDouble() }
    val ans = a/b
    println("%.2f".format(ans))
}