import java.util.Scanner

fun main(args: Array<String>) {
//    val sc = Scanner(System.`in`)
    val t = readLine()!!.toInt()

    // Precompute Fibonacci up to 60
    val fib = LongArray(61)
    fib[0] = 0
    fib[1] = 1

    for (i in 2..60) {
        fib[i] = fib[i - 1] + fib[i - 2]
    }

    repeat(t) {
        val n = readLine()!!.toInt()
        println("Fib($n) = ${fib[n]}")
    }
}
