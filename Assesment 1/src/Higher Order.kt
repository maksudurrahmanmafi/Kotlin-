fun main(args: Array<String>) {
    val x = 10
    val y = 30
    val result = add(x,y){x: Int ,y: Int ->x*y}
    print(result)
}
//val ans2 =

fun add(x: Int,y: Int,Operation:(Int, Int)-> Int): Int{
    return Operation(x,y)
}