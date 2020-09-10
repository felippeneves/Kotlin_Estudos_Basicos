package more_functions

//paramêtro op é do tipo função
fun operator (x: Int, y: Int, op: (Int, Int) -> Int) : Int
{
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

//Função do paramêtro apenas executa e não retorna nada
fun <T> Iterable<T>.paraCada(op: (T) -> Unit)
{
    for (i in this)
        op(i)
}

fun main()
{
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach({ println(it) })
    list.paraCada { println(it) }

    val listStr = listOf("1", "2", "4", "5")
    listStr.paraCada { println(it) }

    val map = mapOf(Pair("Paris", "França"))
//    map.paraCada { println(it) }

    //passando a função soma por paramêtro
    operator(1, 2, ::sum)
    operator(1, 2, ::multiply)

}