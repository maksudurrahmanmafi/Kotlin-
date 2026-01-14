fun main(agrs: Array<String>){
    val input = readLine()!!.split(" ")
    val a = input[0].toDouble()
    val b = input[1].toDouble()
    val c = input[2].toDouble()
    val triangulo = 0.5 * a * c
    val circulo = 3.14159 * c * c
    val trapezio = 0.5 * (a + b) * c
    val quadrado = b * b
    val retangulo = a * b
    println("TRIANGULO: %.3f".format(triangulo))
    println("CIRCULO: %.3f".format(circulo))
    println("TRAPEZIO: %.3f".format(trapezio))
    println("QUADRADO: %.3f".format(quadrado))
    println("RETANGULO: %.3f".format(retangulo))
}