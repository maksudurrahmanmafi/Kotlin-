fun main(args: Array<String>) {
    while(true){
        var(x,y)=readLine()!!.split(" ").map { it.toInt() }
        if(x<=0 ||y<=0){
            return
        }
        if(x>y){
            var temp =x
            x=y
            y=temp


        }
        var sum =0
        for (i in x..y){
            sum+=i
            print("$i ")
        }
        println("Sum=$sum")
    }
}