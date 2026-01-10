fun main(){
    print("Enter your x : ")
    var x =readln().toIntOrNull()
    print("Enter your y : ")
    var y =readln().toIntOrNull()
    print("Enter your z : ")
    var z =readln().toIntOrNull()
    if(x==null||y==null||z==null){
        print("Invalid Input")
        return
    }
    else{
        if(x>=y &&x>=z)print("X boro ")
        else if(y>=z)print("Y boro ")
        else print("Z boro ")
    }
}