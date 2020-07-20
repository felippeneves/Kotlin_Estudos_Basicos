package null_safe

fun main()
{
    val str: String? = null

    //Como o atributo é null safe, é obrigatório usar o '?' (Elvis operator). É um conceito nullsafe
    println(str?.length)

    //Mesmo teste acima utilizando java
//    ForcaErro().erro()


    //Utilizando o '!!' se der erro uma exceção será lançada, diferente de quando usa o Elvis operator (?). Portanto utilizando o '!!', não fica nullsafe
    println(str!!.length)
}