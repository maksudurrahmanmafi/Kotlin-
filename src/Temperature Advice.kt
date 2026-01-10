fun main() {
    print("Enter your temperature: ")
    var temp = readln().toIntOrNull()
    if (temp == null) {
        print("Invalid Input")
        return
    } else {
        if (temp < 0) print("Freezing")
        else if (temp <= 15) print("cold")
        else if (temp <= 30) print("warm")
        else print("Hot")
    }
}