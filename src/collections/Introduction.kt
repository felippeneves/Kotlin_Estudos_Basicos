package collections

fun main()
{
    //List - array, Set, Hashmap

    //Não é possível adicionar/remover elementos
    val l1 = listOf("Madrid", "São Paulo", "Berlim")

    //É possível adicionar/remover elementos
    val l2 = mutableListOf("Madrid", "São Paulo", "Berlim")

    //Herda do array list do java
    val a1 = arrayListOf("Madrid", "São Paulo", "Berlim")

    //Não é adicionado no set elementos identicos/Não é possível adicionar/remover elementos
    val s1 = setOf("Madrid", "São Paulo", "Berlim", "Berlim")
//    println(s1.size)

    //Não é adicionado no set elementos identicos/É possível adicionar/remover elementos
    val s2 = mutableSetOf("Madrid", "São Paulo", "Berlim", "Berlim")
//    println(s1.size)

    //Herda do hash map do java
    val h1 = hashMapOf(Pair("key", "value"), Pair("key2", "value2"))
    println(h1.entries)

    //Não é possível adicionar/remover elementos
    val m1 = mapOf(Pair("key", "value"), Pair("key2", "value2"))

    //É possível adicionar/remover elementos
    val m2 = mutableMapOf(Pair("key", "value"), Pair("key2", "value2"))
}