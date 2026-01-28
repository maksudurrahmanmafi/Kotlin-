class BankAccount(private val accountNUmber: String){
    private var balance: Double=0.0
    fun getBalance(){
        println("Now your balance is : $balance")
    }
    fun deposit(amount: Double){
        if(amount<0){
            println("Invalid Amount")
        }
        else{
            balance+=amount
            getBalance()
        }

    }
    fun withdraw(amount: Double){
        if(amount<0.0){
            println("Invalid withdraw amount")
        }
        else if(amount>balance){

            println("Insufficient Balance")
        }
        else{

            balance-=amount
            getBalance()
        }
    }


}

fun main(args: Array<String>) {
    print("Enter your account num : ")
    val account_num = readLine()!!

    val bank = BankAccount(account_num)
    println("Do you want to deposit or withdraw press 0 for deposit and 1 for withdraw")
    val a = readLine()!!.toInt()
    if(a==0){
        print("Enter your deposit amount : ")
        val value = readLine()!!.toDouble()
        bank.deposit(value)

    }
    else{
        print("Enter your withdraw amount : ")
        val value = readLine()!!.toDouble()
        bank.withdraw(value)

    }

   /* bank.getBalance()
    bank.withdraw(1223.0)
    bank.getBalance()*/

}