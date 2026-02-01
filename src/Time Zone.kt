fun main(args: Array<String>) {
    val(a,b,c)=readLine()!!.split(" ").map { it.toInt() }
    val ans = a+b+c
    if(ans%24==0){
        println(0)
    }
    else if(c>=0){
        println(ans%24)

    }
    else{
        if(ans<0)println(24+ans)
        else{
            println(ans%24)
        }
    }

}