 open class Hello{
//     protected class Hello2{
//
//     }
     protected fun D(){
         println("Println this is Montu")
     }

}
 class In:Hello(){
     fun show(){
         D()


     }

 }

fun main() {
    val obje =Hello()

    val ob = In()
    ob.show()

}