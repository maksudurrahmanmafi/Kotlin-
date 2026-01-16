import java.util.*
fun main(args: Array<String>){
    val(a,b,c,d)=readLine()!!.split(" ").map { it.toInt() }
    if(a==c &&b==d)println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
    else if(a < c || (a == c && b < d)){
/*        if((c-a==1 && b>d)){
            println("O JOGO DUROU 0 HORA(S) E ${60-b+d} MINUTO(S)")

        }
        else if((c-a>1)&&b>d){
            println("O JOGO DUROU ${(c-a)-1} HORA(S) E ${60-b+d} MINUTO(S)")


        }    else if((c-a>1)&&b<d){
            println("O JOGO DUROU ${(c-a)} HORA(S) E ${d-b} MINUTO(S)")


        } else if((c-a>=1)&&b==d){
            println("O JOGO DUROU ${(c-a)} HORA(S) E 0 MINUTO(S)")


        }
        else if(a==c&&b>d){
            println("O JOGO DUROU 0 HORA(S) E ${60-b+d} MINUTO(S)")


        }
        else{
            println("O JOGO DUROU 0 HORA(S) E ${d-b} MINUTO(S)")


        }*/
        val hour = c - a
        if (b > d) {
            println("O JOGO DUROU ${hour - 1} HORA(S) E ${60 - b + d} MINUTO(S)")
        }
        else if (b < d) {
            println("O JOGO DUROU $hour HORA(S) E ${d - b} MINUTO(S)")
        }
        else {
            println("O JOGO DUROU $hour HORA(S) E 0 MINUTO(S)")
        }
    }
    else{
        val hour = (24 - a) + c
        if (b > d) {
            println("O JOGO DUROU ${hour - 1} HORA(S) E ${60 - b + d} MINUTO(S)")
        }
        else if (b < d) {
            println("O JOGO DUROU $hour HORA(S) E ${d - b} MINUTO(S)")
        }
        else {
            println("O JOGO DUROU $hour HORA(S) E 0 MINUTO(S)")
        }
    }
}