fun main(args: Array<String>) {
    val startDay = readLine()!!.split(" ")[1].toInt()
    val startTime = readLine()!!.split(" : ").map { it.toInt() }

    val endDay = readLine()!!.split(" ")[1].toInt()
    val endTime = readLine()!!.split(" : ").map { it.toInt() }

    // Start time in seconds
    val startSeconds =
        startDay * 86400 +
                startTime[0] * 3600 +
                startTime[1] * 60 +
                startTime[2]

    // End time in seconds
    val endSeconds =
        endDay * 86400 +
                endTime[0] * 3600 +
                endTime[1] * 60 +
                endTime[2]

    var diff = endSeconds - startSeconds

    val days = diff / 86400
    diff %= 86400

    val hours = diff / 3600
    diff %= 3600

    val minutes = diff / 60
    val seconds = diff % 60

    println("$days dia(s)")
    println("$hours hora(s)")
    println("$minutes minuto(s)")
    println("$seconds segundo(s)")
}
