fun main() {

    val result = agoToText(81676)
    println(result)

}

fun agoToText(seconds: Int) {
    when (true) {
        (seconds < 61) -> println("был(а) только что")
        (seconds < (60 * 60)) -> {
            val minutes = seconds / 60
            when {
                minutes in 11..14 -> println("был(а) $minutes минут назад") // сразу "отсекаем" исключения
                minutes % 10 in 2..4 -> println("был(а) $minutes минуты назад")
                minutes % 10 == 1 -> println("был(а) $minutes минуту назад")
                else -> println("был(а) $minutes минут назад")

            }
        }

        (seconds < 24 * 60 * 60) -> {
            val hours = seconds / 60 / 60
            when {
                hours in 11..14 -> println("был(а) $hours часов назад") // сразу "отсекаем" исключения
                hours % 10 in 2..4 -> println("был(а) $hours часа назад")
                hours % 10 == 1 -> println("был(а) $hours час назад")
                else -> println("был(а) $hours часов назад")


            }
        }

        (seconds < 24 * 60 * 60 * 2) -> println("был(а) вчера")
        (seconds < 24 * 60 * 60 * 3) -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
}

