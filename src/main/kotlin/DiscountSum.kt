package ru.netology

fun main() {
    val lastAmount: Int = 15400
    val thisAmount: Int = 7000
    val privelege: Boolean = true
    val maxDiscount: Int = 5

    val discount: Int = if (lastAmount >= 10001) maxDiscount * lastAmount / 100 else if (lastAmount >= 1001) 100 else 0
    val privelegeDiscount: Double = if (privelege) 0.99 else 1.00
    val finalSum: Int = ((thisAmount - discount) * privelegeDiscount).toInt()
    val totalDiscount: Int = thisAmount - finalSum

    println("Сумма платежа: $finalSum руб. Общая сумма скидки $totalDiscount руб.")

}