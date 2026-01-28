fun main(args: Array<String>) {
    val(a,b,c,d)=readLine()!!.split(" ").map { it.toInt() }
    val ans =(a+b+c+d)-3
    println(ans)
}