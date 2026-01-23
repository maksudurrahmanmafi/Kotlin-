fun main(args: Array<String>) {
    for(i in 0..9){
        val a =readLine()!!.toInt()
        if(a > 0){
            println("X[$i] = $a")
        }
        else{
            println("X[$i] = 1")

        }
    }
}