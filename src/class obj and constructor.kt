/*class  Parent(val name: String,val Roll : Int){
    fun showdetails(){
        print("$name Name $Roll roll")
    }

}*/
class Parent2{
    var name: String=""
    var roll: Int=0
    constructor( N: String,R:Int){
//        fun name (){
            this.name=N
           this.roll = R
//        }

    }
    constructor(N: String){
//        fun name(){
           this.name = N

//        }
    }
    fun show(){
        print("Name is : $name Roll is: $roll")
    }

}

fun main(args: Array<String>) {
   /* val a = Parent("Mafi" ,10)
    a.showdetails()*/
    val obj =Parent2("Name",10)
    val obj2 =Parent2("Utsho")
//    obj2.show()
    obj.show()
}