fun main(){
    print("Enter your first number: ")
    var num1 = readln().toIntOrNull()
    print("Enter your second number: ")
    var num2 = readln().toIntOrNull()
    if(num1==null ||num2==null){
        print("Invalid Input! Please Enter valid input ")
        return
    }
    println("Summation of num1 and num2 is $num1 + $num2 = ${num1+num2}")
    println("Subtraction of num1 and num2 is $num1 - $num2 = ${num1-num2}")
    println("Multiplication of num1 and num2 is $num1 * $num2 = ${num1*num2}")
    println("Division of num1 and num2 is $num1 / $num2 = ${num1/num2}")
    println("Remainder of num1 and num2 is $num1 % $num2 = ${num1%num2}")
    println("post-increment of num1 ans num2 is : ${num1++ } and ${ num2++} ")

    println("Pre-increment of num1 ans num2 is : ${++num1 } and ${ ++num2} ")
    println("post-decrement of num1 ans num2 is : ${num1-- } and ${ num2--} ")
    println("pre-decrement of num1 ans num2 is : ${--num1 } and ${ --num2} ")

}
//Maksudur Rahman Mafi
