fun main(){
    print("Enter your Num for multiplication table: " )
    var x =readln().toInt()
    var i =1
    while(i<=10){
        var ans = x*i
        println("$x * $i = $ans")
        i++
    }
}