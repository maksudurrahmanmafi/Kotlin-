object mafi{
    var name = ""
    fun show(){
        println("Name: $name")
    }
}
object jui{
    var name = ""
    fun show(){
        print("Name: $name")
    }
}

fun main(args: Array<String>) {
    mafi.name="Mafi"
    mafi.show()
    jui.name ="Jui"
    jui.show()
}