fun main(args: Array<String>) {
    while (true){
        val a =readLine()!!.toInt()
        if(a==0)return
        var sum =0

        if(a%2==0){
            for(i in a until a+10 step 2){
                if(i%2==0) sum+=i

            }
        }
        else{
            for(i in a+1 until a+10 step 2){
                if(i%2==0) sum+=i

            }

        }
        println(sum)
    }
}