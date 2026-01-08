fun main(){
    print("Enter your First num: ")
    var first = readln().toIntOrNull()
    print("Enter your Second num: ")
    var second = readln().toIntOrNull()
    if(first==null||second==null){
        print("Invalid Input")
        return
    }
    if(first>=10 && second>=10)print("Yes\n")
    else print("No")

}
