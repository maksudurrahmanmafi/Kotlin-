fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        when {
            n % 2 == 0 -> println(0)
            else -> println(1)
        }


    }
}