fun main(args: Array<String>) {
    var sum =0.0
    var cnt = 0.0
    while (true){
        val a = readLine()!!.toDouble()
        if(a<0)break
        else {
            sum+=a
            cnt++
        }

    }
    val ans = sum/cnt
    println("%.2f".format(ans))
}