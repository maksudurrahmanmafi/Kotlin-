fun main() {
    print("Enter first choice (Rock/Paper/Scissors): ")
    val p1 = readln().trim().lowercase()

    print("Enter second choice (Rock/Paper/Scissors): ")
    val p2 = readln().trim().lowercase()

    val result = when {
        p1 == p2 -> "Tie"
        p1 == "rock" && p2 == "scissors" -> "First player wins"
        p1 == "scissors" && p2 == "paper" -> "First player wins"
        p1 == "paper" && p2 == "rock" -> "First player wins"
        p2 == "rock" && p1 == "scissors" -> "Second player wins"
        p2 == "scissors" && p1 == "paper" -> "Second player wins"
        p2 == "paper" && p1 == "rock" -> "second player wins"
        else -> print("Invalid InputÏ")

    }

    println(result)

}

