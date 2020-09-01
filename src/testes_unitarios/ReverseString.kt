package testes_unitarios


fun reverseUsingSB(str: String) : String
{
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String) : String
{
    var strBuilder = StringBuilder()

    for (i in str.length - 1 downTo 0)
        strBuilder.append(str[i])

    return strBuilder.toString()
}