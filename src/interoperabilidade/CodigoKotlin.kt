package interoperabilidade

fun main()
{
    var list: ArrayList<Int> = ArrayList()

    list.add(99)
    list.add(100)
    list.add(300)
    list.add(1)

    println("Antes da ordenação")

    for (i in list)
        println("$i")

    println("Depois da ordenação")

    list = CodigoJava().ordenaValores(list)

    for (i in list)
        println("$i")
}