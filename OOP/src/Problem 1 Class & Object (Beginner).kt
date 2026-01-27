class Student(val name: String,val roll: Int,val marks: Double ){

/*    var kolom = ""
    constructor(name: String,roll: Int,marks: Double,kolom: String):this(name,roll,marks){

    }*/
    fun display(){
        println("Name is :$name\nRoll is: $roll\nMarks is: $marks")
    }
}


class Secondary{
    var name = ""
    var age = 0
    var height = 0.0
    constructor(name: String,age:Int){
        this.name=name
        this.age = age

    }
    constructor(name: String, age: Int, height: Double) {
        this.name = name
        this.age = age
        this.height = height
    }

     fun display() {
        println("Name: $name")
        println("Age: $age")

    }
    fun display2() {
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
    }
}
fun main() {
//    primary constructor
    /*    print("Give me your name roll marks ")
    val input = readLine()!!.split(" ")
    val name =input[0]
    val roll = input[1].toInt()
    val marks = input[2].toDouble()

    val student = Student(name,roll,marks)
    student.display()*/


//    secondary constructor

    print("1 = name age | 2 = name age height : ")
    val choice = readLine()!!.toInt()

    if (choice == 1) {
        print("Enter name and age: ")
        val input = readLine()!!.split(" ")
        val name = input[0]
        val age = input[1].toInt()

        val obj = Secondary(name, age)
        obj.display()

    } else {
        print("Enter name age height: ")
        val input = readLine()!!.split(" ")
        val name = input[0]
        val age = input[1].toInt()
        val height = input[2].toDouble()

        val obj = Secondary(name, age, height)
        obj.display2()

    }
}