abstract class Applince{
    abstract fun calculatePowerUsage()
}

class Fan():Applince(){
    override fun calculatePowerUsage() {
        val run = 16
        val wat = 75
        val kWh = run*wat/1000.0
        println("power use : $kWh")

    }
}class AirConditioner():Applince(){
    override fun calculatePowerUsage() {
        val run = 11
        val wat = 1500
        val kWh = run*wat/1000.0
        println("power use : $kWh")

    }
}class LightBulb():Applince(){
    override fun calculatePowerUsage() {
        val run = 13
        val wat = 10
        val kWh = run*wat/1000.0
        println("power use : $kWh")

    }
}

fun main(args: Array<String>) {
    val obj = Fan()
    val obj1 = AirConditioner()
    val obj2 = LightBulb()
    obj.calculatePowerUsage()
    obj1.calculatePowerUsage()

    obj2.calculatePowerUsage()

}