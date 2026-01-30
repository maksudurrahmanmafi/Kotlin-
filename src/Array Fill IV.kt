fun main(args: Array<String>) {
    var par = IntArray(5)
    var impar = IntArray(5)
    var p =0
    var i =0
    repeat(15){
        val a = readLine()!!.toInt()
        if(a%2==0){
            par[p]=a
            p++
            if(p==5){
                for (j in 0..4){
                    println("par[$j] = ${par[j]}")
                }
                p=0
            }
        }
        else{
            impar[i]=a
            i++
            if(i==5){
                for (j in 0..4){
                    println("impar[$j] = ${impar[j]}")
                }
                i=0
            }
        }

    }
    for (j in 0 until i) {
        println("impar[$j] = ${impar[j]}")
    }

    // print remaining even numbers
    for (j in 0 until p) {
        println("par[$j] = ${par[j]}")
    }
}