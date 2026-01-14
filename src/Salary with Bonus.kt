fun main(args:Array<String>){
    var name = readLine()!!
    var s1 =readLine()!!.toDouble()
    var s2 = readLine()!!.toDouble()
    var ans = s2*.15
    println("TOTAL = R$ %.2f".format(s1+ans))

}