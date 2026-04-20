import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val first = br.readLine().toInt()

    var maxVote = first

    for (i in 1 until n) {
        val v = br.readLine().toInt()
        if (v > maxVote) maxVote = v
    }

    if (first == maxVote) println("S") else println("N")
}