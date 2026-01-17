fun main(){
    val n = readLine()!!.toDouble()
    if(n>=0 &&n<=400.00){
        val  ans = n+(n*.15)
        val ans2 = n*.15
        println("Novo salario: %.2f".format(ans))
        println("Reajuste ganho: %.2f".format(ans2))
        println("Em percentual: 15 %")
    } else if(n<=800.00){
        val ans = n+(n*.12)
        val ans2 = n*.12
        println("Novo salario: %.2f".format(ans))
        println("Reajuste ganho: %.2f".format(ans2))
        println("Em percentual: 12 %")
    }else if(n<=1200.00){
        val ans = n+(n*.10)
        val ans2 =n*.10
        println("Novo salario: %.2f".format(ans))
        println("Reajuste ganho: %.2f".format(ans2))
        println("Em percentual: 10 %")
    }else if(n<=2000.00){
        val ans = n+(n*.07)
        val ans2 = n*.07
        println("Novo salario: %.2f".format(ans))
        println("Reajuste ganho: %.2f".format(ans2))
        println("Em percentual: 7 %")
    }else {
        val ans = n+(n*.04)
        val ans2 = n*.04
        println("Novo salario: %.2f".format(ans))
        println("Reajuste ganho: %.2f".format(ans2))
        println("Em percentual: 4 %")
    }
}