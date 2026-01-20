fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t){
        val (x,y)=readLine()!!.split(" ").map { it.toDouble() }
        if(y==0.0)println("divisao impossivel")
        else{
            val ans = x/y
            println("%.1f".format(ans))
        }
    }
}