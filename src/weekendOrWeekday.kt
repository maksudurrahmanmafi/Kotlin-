fun main() {
    print("Enter day from 1 - 7 : ")
    var day = readln().toIntOrNull()
    if (day == null || day < 0 || day > 7) {
        print("Invalid Input")
        return
    } else {
        if (day == 7) print("Weekend")
        else print("Weekday")
    }
}
