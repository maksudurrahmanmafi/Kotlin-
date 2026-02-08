fun main(args: Array<String>) {
    while (true) {
        val line = readLine() ?: break
        val (a, b, c) = line.split(" ").map { it.toInt() }

        if ((b < a && a < c) || (c < a && a < b)) {
            println("huguinho")
        } else if ((a < b && b < c) || (c < b && b < a)) {
            println("zezinho")
        } else {
            println("luisinho")
        }
    }
}
