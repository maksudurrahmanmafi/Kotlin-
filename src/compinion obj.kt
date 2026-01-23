class CompinionObj(){

    companion object{
        fun add(a: Int,b: Int){
            print(a+b)
        }
    }
}
class  SecondCompinionObj{
    companion object{
        var a =0
        var b =0
        fun show(){
            println(a+b)
        }
    }
}
class  Obj{
    var a =0
    var b =0
    fun showD(){
        println(a+b)
    }
}
fun main(args: Array<String>) {
//    CompinionObj.add(12,10)

    SecondCompinionObj.a=98
    SecondCompinionObj.show()


    //Without Compinion Obj
    Obj().a = 15
    Obj().showD()
    val obj =Obj()
    obj.a = 25
    obj.showD()
   /* val obj =Obj()
    obj.a=10
    obj.showD()
*/
}