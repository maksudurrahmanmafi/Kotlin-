fun main() {
    print("Enter your age : ")
    var age = readLine()!!.toIntOrNull()
    if (age == null) {
        print("Invalid input")
        return
    } else if (age >= 18) print("You are Eligible for vote")
    else print("you are not eligible for vote")
}
