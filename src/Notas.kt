fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    when {
        x == 0 -> println("E")
        x in 1..35 -> println("D")
        x in 36..60 -> println("C")
        x in 61..85 -> println("B")
        else -> println("A")
    }
}