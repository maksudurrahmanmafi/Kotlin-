import java.util.*

fun main(args:Array<String>) {
//    Locale.setDefault(Locale.US)

    val input = readLine()!!.split(" ").map { it.toDouble() }
    val n1 = input[0]
    val n2 = input[1]
    val n3 = input[2]
    val n4 = input[3]

    val media = (n1*2 + n2*3 + n3*4 + n4) / 10.0
    println("Media: %.1f".format(media))

    when {
        media >= 7.0 -> {
            println("Aluno aprovado.")
        }
        media < 5.0 -> {
            println("Aluno reprovado.")
        }
        else -> {
            println("Aluno em exame.")
            val exam = readLine()!!.toDouble()
            println("Nota do exame: %.1f".format(exam))

            val finalMedia = (media + exam) / 2.0

            if (finalMedia >= 5.0)
                println("Aluno aprovado.")
            else
                println("Aluno reprovado.")

            println("Media final: %.1f".format(finalMedia))
        }
    }
}
