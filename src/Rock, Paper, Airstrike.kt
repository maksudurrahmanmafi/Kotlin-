fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    repeat(n) {
        val s1 = readLine()!!.trim() // Player 1
        val s2 = readLine()!!.trim() // Player 2

        val result = when {
            s1 == "ataque" && s2 == "ataque" -> "Aniquilacao mutua"
            s1 == "ataque" && s2 != "ataque" -> "Jogador 1 venceu"
            s1 != "ataque" && s2 == "ataque" -> "Jogador 2 venceu"
            s1 == "pedra" && s2 == "pedra" -> "Sem ganhador"
            s1 == "papel" && s2 == "papel" -> "Ambos venceram"
            s1 == "papel" && s2 == "pedra" -> "Jogador 1 venceu"
            s1 == "pedra" && s2 == "papel" -> "Jogador 2 venceu"
            else -> "Sem ganhador" // safety, although all cases handled
        }

        println(result)
    }
}
