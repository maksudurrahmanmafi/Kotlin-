fun main(args: Array<String>) {
    var t = readLine()!!.toInt()
    var st = 0
    var end = t-1
    for(i in 0 until 1000){
        if(st==end){
            st = 0
            println("N[$i] = ${end}")
        }
        else{
            println("N[$i] = ${st}")
            st++
        }
    }
}