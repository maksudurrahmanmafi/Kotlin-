fun main() {
    print("Enter purchase amount: ")
    val amount = readln().toDoubleOrNull()

    if (amount == null || amount < 0) {
        println("Invalid amount")
        return
    }

    val discount = when {
        amount < 100 -> 0.0
        amount <= 500 -> amount * 0.10
        else -> amount * 0.20
    }

    val finalPrice = amount - discount

    println("Discount: $$discount")
    println("Final price to pay: $$finalPrice")
}
