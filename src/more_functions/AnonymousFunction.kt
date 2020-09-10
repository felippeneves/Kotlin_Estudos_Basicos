package more_functions

fun operator3(x: Int, y: Int, op: (Int, Int) -> Int) : Int
{
    return op(x, y)
}

fun semNome(n1: Int, n2: Int) : Int
{
    return n1 + n2
}

fun main()
{
    //Função anonima, sempre deve ser respeitado os paramêtros esperados como paramêtro
    operator3(1, 2, fun (n1: Int, n2: Int) : Int {
        val sum = n1 + n2
        println(sum)
        return sum
    })

    operator3(1, 2, ::semNome)
}