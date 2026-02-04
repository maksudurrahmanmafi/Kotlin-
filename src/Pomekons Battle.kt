fun main() {
    val t = readLine()!!.trim().toInt()

    repeat(t) {
        val bonus = readLine()!!.trim().toInt()

        val (a1, d1, l1) = readLine()!!.trim().split(" ").map { it.toInt() }
        val (a2, d2, l2) = readLine()!!.trim().split(" ").map { it.toInt() }

        var value1 = a1 + d1
        var value2 = a2 + d2

        // Bonus apply if level is even
        if (l1 % 2 == 0) {
            value1 += bonus
        }
        if (l2 % 2 == 0) {
            value2 += bonus
        }

        // Compare values
        when {
            value1 > value2 -> println("Dabriel")
            value2 > value1 -> println("Guarte")
            else -> println("Empate")
        }
    }
}
