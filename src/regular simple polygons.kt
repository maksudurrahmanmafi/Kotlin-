import java.util.*

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toLong() }
    println(a*b)
}