fun main(){
    val(a,b,c)=readLine()!!.split(" ").map { it.toInt() }
    val mx = maxOf(a,b,c)
    println("$mx eh o maior")
}
