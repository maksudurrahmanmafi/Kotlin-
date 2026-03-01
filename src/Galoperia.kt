fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t) {
        val s = readLine()!!
            val x = s.length.toDouble()
            val result = x / 100.0
            println("%.2f".format(result))
        }

}