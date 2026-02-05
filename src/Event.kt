import java.util.*

import java.math.BigInteger

fun main(args: Array<String>) {
    while (true) {
        val input = readLine() ?: break
        val parts = input.split(" ")

        val X = parts[0].toInt()
        val M = parts[1]

        if (X == 0 && M == "0") break

        val result = BigInteger(M).multiply(BigInteger.valueOf(X.toLong()))

        println(result)
    }
}