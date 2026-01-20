fun main(args: Array<String>) {
    while (true) {
        var (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (x == y) {
            return
        }
        if (x > y) {
            println("Decrescente")
        } else println("Crescente")

    }
}