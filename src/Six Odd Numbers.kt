fun main(args: Array<String>) {
    val num = readLine()!!.toInt()

    if(num%2==0){
        val ans = num +12

        for(i in num+1 until ans step 2)println(i)
    }
    else{
        val ans2 = num+10
        for(i in num..ans2 step 2)println(i)
    }


}
