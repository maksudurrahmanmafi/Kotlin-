

fun main(args: Array<String>) {
   solvee()
}
fun solvee(){
    val n = readLine()!!.toInt()
    for(i in 1..n){
        if(n%i==0)println(i)
    }

}