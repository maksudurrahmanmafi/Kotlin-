fun main() {
    print("Enter your age : ")
    var age = readln().toIntOrNull()
    if (age == null || age < 0) {
        print("Invalid Input")
        return
    } else {
        if (age <= 12) print("Child")
        else if (age <= 19) print("Teenager")
        else if (age <= 59) print("Adult")
        else print("Senior")
    }
}
