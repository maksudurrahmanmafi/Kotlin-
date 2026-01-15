import java.util.*
import  kotlin.math.*

fun main(args: Array<String>){
    val(x,y)=readLine()!!.split(" ").map { it.toDouble() }
    val(x1,y1)=readLine()!!.split(" ").map { it.toDouble() }
    val ans = sqrt((x1-x).pow(2)+(y1-y).pow(2))
    println("%.4f".format(ans))
}