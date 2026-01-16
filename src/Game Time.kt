fun main(){
    val(a,b)=readLine()!!.split(" ").map { it.toInt() }
   /* if(a==b){
        println("O JOGO DUROU 24 HORA(S)")
    }
    else if(a>b)println("O JOGO DUROU ${24-a+b} HORA(S)")
    else println("O JOGO DUROU ${b-a} HORA(S)")*/
    val ans = when{
        a==b->24
        a>b ->(24-a)+b
        else ->b-a
    }
    println("O JOGO DUROU $ans HORA(S)")
}