fun main() {
    print("Enter your exam num  : ")
    var num = readln().toIntOrNull()
    if (num == null) {
        print("Invalid Input")
        return
    } else {
        if (num > 90) print("A")//90 enter korle F asbe
        else if (num >= 80 && num < 90) print("B")
        else if (num >= 70 && num < 80) print("C")
        else if (num >= 60 && num < 70) print("C")
        else print("F")
    }
}