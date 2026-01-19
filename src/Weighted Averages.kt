fun main(args: Array<String>) {
    val n =readLine()!!.toInt()
    repeat(n){
        val(a,b,c)=readLine()!!.split(" ").map { it.toDouble() }
        val ans =(a*2 + b*3 + c*5)/10.0
        println("%.1f".format(ans))
    }

}