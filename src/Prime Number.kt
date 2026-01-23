import kotlin.math.*
fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t){
        val a = readLine()!!.toInt()
        var bool = true
        for(i in 2 until a){
            if(a%i==0){
                bool=false
                break
            }

        }
        println(if(bool)"$a eh primo" else "$a nao eh primo")
    }
}