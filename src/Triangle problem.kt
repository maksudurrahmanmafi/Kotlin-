import java.util.*

fun main(args: Array<String>) {

    val input = readLine()!!.split(" ").map { it.toInt() }
    val sticks = input.sorted()


    val canFormTriangle = (sticks[0] + sticks[1] > sticks[2]) ||
            (sticks[1] + sticks[2] > sticks[3])

    if (canFormTriangle) {
        println("S")
    } else {
        println("N")
    }

}