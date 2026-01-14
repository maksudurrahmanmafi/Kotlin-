import java.util.*

fun main(args: Array<String>) {

    val(a,b,c,d)=readLine()!!.split(" ").map { it.toInt() }
    if (b > c && d > a && (c + d > a + b) && c > 0 && d > 0 && a % 2 == 0) {
        println("Valores aceitos")
    }
    else println("Valores nao aceitos")
}