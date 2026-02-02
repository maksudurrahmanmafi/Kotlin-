import java.util.*



fun main(args: Array<String>) {
    var(n,m)=readLine()!!.split(" ").map { it.toInt() }      // number of actions

    repeat(m) {
        val action = readLine()!!
        if (action == "fechou") {
            n += 1
        } else if (action == "clicou") {
            n -= 1
        }
    }

    println(n)
}