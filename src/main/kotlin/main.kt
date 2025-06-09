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
                minutes == 1 -> println("был(а) минуту назад")
                minutes == 2 || minutes == 3 || minutes == 4 -> println("был(а) $minutes минуты назад")
                minutes == 22 || minutes == 23 || minutes == 24 -> println("был(а) $minutes минуты назад")
                minutes == 32 || minutes == 33 || minutes == 34 -> println("был(а) $minutes минуты назад")
                minutes == 42 || minutes == 43 || minutes == 44 -> println("был(а) $minutes минуты назад")
                minutes == 52 || minutes == 53 || minutes == 54 -> println("был(а) $minutes минуты назад")
                else -> println("был(а) $minutes минут назад")

            }
        }

        (seconds < 24 * 60 * 60) -> {
            val hours = seconds / 60 / 60
            when {
                hours == 1 -> println("был(а) час назад")
                hours == 2 || hours == 3 || hours == 4 -> println("был(а) $hours часа назад")
                hours == 22 || hours == 23 || hours == 24 -> println("был(а) $hours часа назад")
                hours == 32 || hours == 33 || hours == 34 -> println("был(а) $hours часа назад")
                hours == 42 || hours == 43 || hours == 44 -> println("был(а) $hours часа назад")
                hours == 52 || hours == 53 || hours == 54 -> println("был(а) $hours часа назад")
                else -> println("был(а) $hours часов назад")

            }
        }

        (seconds < 24 * 60 * 60 * 2) -> println("был(а) вчера")
        (seconds < 24 * 60 * 60 * 3) -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
}

