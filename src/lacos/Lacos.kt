package lacos

fun main()
{
    testeFor("Felippe Neves")
    println()
    testeFor2()
    println()
    testeWhile()
    println()
    testeDoWhile()
}
fun testeFor(nome: String)
{
    for (s in nome)
        print("$s ")
}

fun testeFor2()
{
    //Normal
    for (i in 1..20)
        print("$i ")

    println()

    //Pulando
    for (i in 1..20 step 2)
        print("$i ")

    println()

    //Pulando - do 20 ao 1
    for (i in 20 downTo 1 step 2)
        print("$i ")
}

fun testeWhile()
{
    var index : Int = 0
    while(index < 10)
    {
        print("$index ")
        index++

        //utilização do break
//        if(index == 8)
//            break
    }
}

fun testeDoWhile()
{
    var l : Int = 10
    do
    {
        print("$l")
    } while (l > 100)
}