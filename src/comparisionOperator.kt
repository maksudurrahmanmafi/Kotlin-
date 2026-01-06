fun main(){
    print("Enter your first value : ")
    var num = readln().toIntOrNull()
    print("Enter your second value")
    var num2 = readln().toIntOrNull()

    if (num == null || num2 == null) {
        println("Invalid input! Please enter valid integers.")
        return
    }
    //Equal to
    if(num==num2)println("Both are Equal")
    else println("Num one and Num two Different")
    //Grater than
    if(num>num2)println("Num one is grater than num two")
    else println("Num one is not grater than or Equal Num two ")
    //less than
    if(num<num2)println("Num one is not grater than num two")
    else println("Num one is  grater than or Equal Num two")
    //Grater than or Equal
    if(num>=num2)println("Num one is  grater than or Equal  Num two")
    else println("Num one is not grater than or Equal Num two")
    //less than or Equal
    if(num<=num2)println("Num one is  less than or Equal Num two")
    else println("Num one is  grater than Num two")
    //Not equal
    if(num!=num2)println("Num one and Num two Different")
    else println("Both are Equal")

}