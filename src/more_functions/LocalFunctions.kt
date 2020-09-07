package more_functions

import java.text.SimpleDateFormat
import java.util.Calendar

fun log(str: String)
{
    println(str)
}

fun top()
{
    fun log(str: String)
    {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${formatted.format(calendar.time)}")
    }

    log("Inicio")

    val interval = 1..10000000
    var sum: Double = 0.0
    for (i in interval)
        sum += 1 * 2 * 1

    log("Fim")

    //Como já tem uma função interna chamada log, para chamar a função externa é necessário chama-la utilizando o nome do pacote
    more_functions.log("Teste função externa")
}


fun main()
{
    top()
    log("Teste")
}