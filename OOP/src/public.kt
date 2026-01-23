 open class X {
    fun view(){
        println("This is public")
    }
}
 class Ce:X(){
     fun Ce(){
         println("This is B")
     }
 }

fun main() {
//    val obj = X()
    val obj = Ce()
    obj.Ce()



}