package Variaveis

fun main()
{
    val caracteristica = "Show!"

    println("Kotlin é uma linguagem ${caracteristica.length}")

    val str = """dsakljdsa
        |dsajkd;sajkldsa
        |dska;ljdas
        |dkslajkldas daskldjsakldsa dsakldjsa
        |   daskldsajlkdsa
    """.trimMargin()

    println(str)
}