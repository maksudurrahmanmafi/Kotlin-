fun main() {
    print("Enter your first value : ")
    var num = readln().toIntOrNull()
    print("Enter your second value : ")
    var num2 = readln().toIntOrNull()

    if (num == null || num2 == null) {
        println("Invalid input! Please enter valid integers.")
        return
    }
    if(num%2 ==0 && num2%2==0) println("Both Even")
    else println("Both are Not Even ")
    if(num%2 ==0 || num2%2==0) println("Both Even or any of one is even")
    else println("Both are Not Even ")

    var bool = true
    println(!bool)
}