fun main(args: Array<String>) {
    val pass = 2002
    while(true){
        val a = readLine()!!.toInt()
        if(a==pass){
            println("Acesso Permitido")
            return
        }
        else println("Senha Invalida")

    }
}