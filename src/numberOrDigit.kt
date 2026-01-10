fun main() {
    print("Enter your value : ")
    var value = readln().toIntOrNull()
    if (value == null) {
        print("Invalid Input")
        return
    } else {
        if (value >= 0 && value <= 9) print("1 Digit ")
        else if (value <= 99) print("2 Digit ")
        else if (value <= 999) print("3 Digit ")
        else print("More than 3 Digit ")
    }
}