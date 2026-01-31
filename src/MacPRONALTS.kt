fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    var sum =0.0
    repeat(t){
        val input = readLine()!!.split(" ")
        val a = input[0].toInt()
        val b = input[1].toInt()
        when{
            a==1001-> sum +=(1.5*b)
            a==1002-> sum +=(2.5*b)
            a==1003-> sum +=(3.5*b)
            a==1004-> sum +=(4.5*b)
            a==1005-> sum +=(5.5*b)

        }


    }
    println("%.2f".format(sum))
}