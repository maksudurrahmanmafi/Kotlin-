fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        var sum = 0
//        if(n%2!=0)println("$n nao eh perfeito")
//        else{
        for (i in 1 until n) {
            if (n % i == 0) sum += i
        }

//        }
        if (sum == n) println("$n eh perfeito")
        else println("$n nao eh perfeito")
    }
}