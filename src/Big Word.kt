fun main(args: Array<String>) {
    val word = readLine() ?: ""
    if (word.isNotEmpty()) {
        if (word.length >= 10) {
            println("palavrao")
        } else {
            println("palavrinha")
        }
    }
}