fun main() {
    val result = feeCalculation("Мир", 75_000, 0, 0)

    println(result)
}

fun feeCalculation(
    cardType: String,
    transition: Int,
    transitionPerMonth: Int,
    transitionPerDay: Int
): Int {

    val maxTransitionPerMonth = 600_000
    val maxTransitionPerDay = 150_000

    if (transitionPerMonth + transition >= maxTransitionPerMonth && transitionPerDay + transition >= maxTransitionPerDay) {
        println("Перевод недоступен")
        return -1
    }

    return when (cardType) {

        "MasterCard" -> {
            if (transition > 75_000)
                (transition / 100 * 0.6 + 20).toInt()
            else 0
        }

        "Visa" -> {
            val fee = (transition / 100 * 0.75)
            val minFee = 35
            if (fee > minFee) fee.toInt() else minFee
        }

        "Мир" -> 0
        else -> 0
    }
}