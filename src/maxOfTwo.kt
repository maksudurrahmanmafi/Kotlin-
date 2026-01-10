fun main() {
    print("Enter your first number : ")
    var first = readLine()!!.toIntOrNull()
    print("Enter your second number : ")
    var second = readLine()!!.toIntOrNull()
    if (first == null || second == null) {
        print("Invalid Input")
        return
    } else if (first > second) {
        print("Your first num is grater than second number and your number is : $first")
    } else if (first < second) {
        print("Your first num is less than second number and your number is : $second")
    } else print("Your both num is equal")
}