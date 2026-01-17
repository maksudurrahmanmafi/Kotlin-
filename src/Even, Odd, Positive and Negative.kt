fun main() {
    val num = mutableListOf<Int>()
    for(i in 1..5){
        val input = readLine()!!.toInt()
        num.add(input)
    }
    val even = num.filter { it % 2==0 }
    val odd = num.filter { it % 2!=0 }
    val pos = num.filter { it >0 }
    val neg = num.filter { it <0 }
    println("${even.size} valor(es) par(es)")
    println("${odd.size} valor(es) impar(es)")
    println("${pos.size} valor(es) positivo(s)")
    println("${neg.size} valor(es) negativo(s)")
}