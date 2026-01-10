fun main(){
    print("Enter the year: ")
    var value = readln().toIntOrNull()
    if(value==null){
        print("Invalid ")
        return
    }
    else{
        if(value%4==0 &&value%100!=0 || value%400==0)print("Leap year")
        else print("Not a Leap Year")
    }
}
