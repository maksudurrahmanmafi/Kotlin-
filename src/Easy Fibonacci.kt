fun main() {
    val n = readLine()!!.toInt()
    if (n <= 0 || n >= 46) return  // constraint check

    var a = 0
    var b = 1

    for (i in 1..n) {
        print("$a")
        if (i != n) print(" ")  // space between numbers
        val next = a + b
        a = b
        b = next
    }
    println()
}
