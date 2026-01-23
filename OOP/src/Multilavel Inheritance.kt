import javax.swing.Spring

//Multi super class one sub class
open class Super { //Super class
    fun view() {
        println("This is A")
    }
}

open class Sub : Super() {
    //Sub Class
    fun view1() {
        println("This is B")
    }
}
class C:Sub(){




}

fun main(args: Array<String>) {
    val obj = C()
    obj.view()
    obj.view1()
}