package condicao

fun main()
{
    println(testeIfTernario(20))
    println(testeIfElvis(null))
    println(testeIfElvis(200))

    println(testeWhen(200, 200, "Soma"))
    println(testeWhen2(200, 200))
    testeWhen3(101)

}

//Operador ternário
fun testeIfTernario(a: Int) = if(a == 10) "Baixo" else if (a == 20) "Médio" else "Alto"

//Operador Elvis, se a for null a função retorna 100, se não retorna o valor de a
fun testeIfElvis(a: Int?) = a ?: 100

//When
fun testeWhen(a: Int, b: Int, c: String) = when (c)
{
    "Soma" -> a + b
    "Subtração" -> a - b
    else ->
    {
        println("Operação incorreta")
        //retornará esse valor
        0
    }
}

fun testeWhen2(a: Int, b: Int) = when
{
    a > 0 && b > 0 ->
    {
       println("Variáveis maiores que zero")
       100
    }
    else -> 0
}

fun testeWhen3(a: Int)
{
    when (a)
    {
        in 1..100 -> println("Está entre 1 e 100")
        else -> println("Não está entre 1 e 100")
    }
}