fun main(){
    print("Enter your value: ")
    var value = readln().toIntOrNull()
    if(value==null){
        print("Invalid Input")
        return
    }
    println(value);
    value+=5
    println("After add 5 in value the ans is = $value")
    value -=9
    println("After sub 9 in value the ans is = $value")
    value*=5
    println("After multiply by 5 the ans is = $value")
    value/=4
    println("After Divided by 4 the ans is = $value")
    value%=3
    print("Value mod by 3 the reminder is = $value")
}
// Happy coding 🥳