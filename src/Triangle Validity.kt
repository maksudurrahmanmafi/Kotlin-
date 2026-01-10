fun main(){
    print("Enter your x : ")
    var x =readln().toIntOrNull()
    print("Enter your y : ")
    var y =readln().toIntOrNull()
    if(x==null||y==null){
        print("Invalid Input")
        return
    }
    else{
        if(x==0 && y==0)print("On origin")
        else if(x>0 && y>0) print("First Quadrant")
        else if(x>0 && y<0) print("Fourth Quadrant")
        else if(x<0 && y>0) print("Second Quadrant")
        else if(x<0 && y<0) print("Third Quadrant")
    }
}