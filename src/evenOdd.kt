fun main(){
    print("Enter your num: ")
    var num = readLine()!!.toInt()
    if(num==0)print("You Enter Zero it's not a even or odd num")
    else if(num%2==0)print("Even")
    else print("Odd")
}