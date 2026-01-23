class A{
    fun show(){
        println("This is A")
    }
}

class  B{
    fun show(){
        println("This is B")
    }
}

fun main(args: Array<String>) {
    val obj = A()
    obj.show()
    val obj1 =B()
    obj1.show()
}