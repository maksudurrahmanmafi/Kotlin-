
//one super class one sub class
open class Ab{ //Super class
    fun show(){
        println("This is A")
    }
}

class  Bc:Ab(){//Sub Class
    fun Show(){
        println("This is B")
    }
}

fun main(args: Array<String>) {
    val obj = Bc()
    obj.show()
    obj.Show()
}