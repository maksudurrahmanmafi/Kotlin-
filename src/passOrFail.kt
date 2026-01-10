fun main() {
    print("Enter your exam num: ")
    var num = readln().toIntOrNull()
    if (num == null || num < 0 || num > 100) {
        print("Invalid input")
        return
    } else if (num >= 50) print("Pass")
    else print("Fail")
}