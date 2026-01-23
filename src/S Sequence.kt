fun solve(){
    var sum =0.0
    for(i in 1..100){
        sum += 1.0/i
    }
    println("%.2f".format(sum))
}
fun main(args: Array<String>) {
    solve()
}