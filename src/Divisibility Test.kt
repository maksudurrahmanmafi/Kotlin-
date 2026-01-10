fun main() {
    print("Enter your x : ")
    var x = readln().toIntOrNull()

    if (x == null) {
        print("Invalid Input")
        return
    } else {
        if ((x % 5 == 0 && x % 11 == 0) || (x % 5 == 0) || (x % 11 == 0)) print("Divisible")
        else print("Neither")
    }
}
