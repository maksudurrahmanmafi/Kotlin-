fun main(args: Array<String>) {
        val n = readLine()!!.toInt()

        for (i in 1..10000) {
            if (i % n == 2) println(i)
        }


}