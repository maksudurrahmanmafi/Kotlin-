fun main(args: Array<String>) {
    val list =mutableListOf<Int>()
    for(i in 0..19){
        val n =readLine()!!.toInt()
        list.add(n)
    }
    list.reverse()
    for(i in 0..19){
        println("N[$i] = ${list[i]}")
    }


}