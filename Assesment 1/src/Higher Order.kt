fun main(args: Array<String>) {
    val x = 10
    val y = 29
    val result = add(x,y,ans2)
    print(result)
}
val ans2 = {x: Int ,y: Int ->x*y}

fun add(x: Int,y: Int,Operation:(Int, Int)-> Int): Int{
    return Operation(x,y)
}