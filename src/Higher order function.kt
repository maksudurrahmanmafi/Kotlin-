fun main(args: Array<String>) {
    val add ={x: Int->x*x}
    var a =10
    print(cal(a,add))
}
fun cal(a: Int,ans:(Int)->Int):Int{
    return ans(a)

}