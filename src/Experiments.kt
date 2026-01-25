fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var total =0
    var rat = 0
    var rabit =0
    var frog =0
    repeat(n){
        val input = readLine()!!.split(" ")
        val a =input[0].toInt()
        val b = input[1][0]
        total+=a
       /* if(b=='R'){
            rat+=a

        }
        else if(b=='C'){
            rabit+=a

        }
        else frog+=a*/
        when(b){
            'R'->rat+=a
            'C'->rabit+=a
            'S'->frog+=a
        }


    }
    println("Total: $total cobaias")
    println("Total de coelhos: $rabit")
    println("Total de ratos: $rat")
    println("Total de sapos: $frog")

    println("Percentual de coelhos: %.2f %%".format(rabit * 100.0 / total))
    println("Percentual de ratos: %.2f %%".format(rat * 100.0 / total))
    println("Percentual de sapos: %.2f %%".format(frog * 100.0 / total))
}