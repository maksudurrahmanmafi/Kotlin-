fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
//    val list = list.take(n)
    val count2 = list.filter { it % 2 == 0 }.size
    val count3 = list.filter { it % 3 == 0 }.size
    val count4 = list.filter { it % 4 == 0 }.size
    val count5 = list.filter { it % 5 == 0 }.size
    println("$count2 Multiplo(s) de 2")
    println("$count3 Multiplo(s) de 3")
    println("$count4 Multiplo(s) de 4")
    println("$count5 Multiplo(s) de 5")
}
