package funcao

fun main()
{
    val a = 10
    val b = 20
    val c = 30

    calcula(a, b, c)
    calcula(a, b, c)
    calcula(a, b, c)
    calcula(a, b, c)
    //
    println(hello("Felippe Neves"))
    println(hello2("Felippe Neves"))
    println(soma(75, 25))
}

fun calcula(a: Int, b: Int, c: Int)
{
    println("O bônus é: ${a + b * c}")
}

fun hello(nome: String) : String
{
    return "Olá, $nome"
}

fun hello2(nome: String) : String = "Olá, $nome"

fun hello3(nome: String) = "Olá, $nome"

fun soma(a: Int, b: Int) = a + b