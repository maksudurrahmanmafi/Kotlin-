fun main(){
    print("Enter your value")
    var value = readln().toIntOrNull()
    if(value==null){
        print("Invalid Input")
        return
    }
    else{
        if(value>0){
            print("Positive")
        }
        else if(value<0) print("Negative")
        else print("Zero")
    }
}
