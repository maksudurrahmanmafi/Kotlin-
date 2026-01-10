fun main(){
    print("Enter your BMI value : ")
    var value = readln().toDoubleOrNull()
    if(value==null||value<0){
        print("Invalid Input")
        return
    }
    else{
        if(value<18.5)print("Underweight")
        else if(value<25)print("Normal")
        else if(value<30)print("Overweight")
        else print("Obese")
    }
}