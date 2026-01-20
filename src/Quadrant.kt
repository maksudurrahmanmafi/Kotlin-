fun main(args: Array<String>) {
    while (true){
        val(x,y)=readLine()!!.split(" ").map { it.toInt() }
        if(x==0||y==0)return
        when{
            x>0 && y>0->println("primeiro")
            x>0&&y<0->println("quarto")
            x<0&&y>0->println("segundo")
            else->println("terceiro")
        }
    }
}