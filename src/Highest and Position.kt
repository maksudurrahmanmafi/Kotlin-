import java.util.*
fun main(args: Array<String>) {
    val mp =mutableMapOf<Int , Int>()
    for(i in 1..100){
        val x = readLine()!!.toInt()
        mp[i]=x
    }
    val mx =mp.maxBy{it.value }
    if(mx!=null) {
        println(mx.value)
        println(mx.key)
    }
}