fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    val student = mutableMapOf<Int , Double>()
    repeat(t){
        val input = readLine()!!.split(" ")
        val reg = input[0].toInt()
        val grade = input[1].toDouble()
        student[reg]=grade
    }

    /*val best = student.maxByOrNull { it.value }

    if(best != null && best.value>=8.0){
        println(best.key)

    }*/
    // Manual search for the best student
    var bestReg = -1
    var bestGrade = -1.0

    for ((reg, grade) in student) {
        if (grade > bestGrade) {
            bestGrade = grade
            bestReg = reg
        }
    }
    if (bestGrade >= 8.0) {
        println(bestReg)
    }

    else{
        println("Minimum note not reached")
    }

}