fun main(){
    var name ="Admin"
    val pass = 1234
    print("Enter your userName : ")
    var name2 = readlnOrNull()
    print("Enter your password: ")
    var pass_2 = readln().toIntOrNull()
    if(name2==null||pass==null){
        print("Invalid Input")
        return
    }
    else{
        if(name==name2 && pass==pass_2){
            print("Access Granted")
        }
        else print("Wrong Password or Unknown User")
    }
}