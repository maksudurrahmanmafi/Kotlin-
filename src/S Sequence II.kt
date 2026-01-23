import kotlin.math.*
import java.util.*

fun main(args: Array<String>) {
    solve1()
}

fun solve1() {
    var st = 1.0;
    var step = 1.0
    var sum = 0.0
//    for(i in st..39){
    while (st <= 39) {
        sum += st / step
        st += 2
        step *= 2

    }
    println("%.2f".format(sum))


}