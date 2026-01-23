fun add(a: Double, b: Double): Double {

    return a+b


}

class Employe(val name: String, val id: Int, val department: String, var salary: Double) {
/*  val name =""
    val id = 0
    val department =""
    var salary = 0

 */
    fun showdetails(increment: Double) {
        println("Name: $name id: $id Department : $department Salary: $salary")
        print("Incremented Salary: ${add(increment,salary)}")
    }
    /* fun add(a: Double){
            salary+=a
            println("Incemented salary is : $salary")Ò
        }

     */

}

fun main(args: Array<String>) {
    val (name, id, department, salary) = readLine()!!.split(" ")
    val emp = Employe(name, id.toInt(), department, salary.toDouble())
    /*emp.showdetails()
    print("Incremnt Salary: ")
    val a =readLine()!!.toDouble()
    emp.add(a)
    emp.showdetails()*/
    val a = readLine()!!.toDouble()


   emp.showdetails(a)



}