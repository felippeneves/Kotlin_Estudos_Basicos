package orientacao_a_objetos.classes

class With
{
    fun teste() {}
    fun teste2() {}
    fun teste3() {}
}

fun main ()
{
    var w = With()

    //Chama os métodos da classe sem a necessidade de utilizar o objeto w
    with(w)
    {
        teste()
        teste2()
        teste3()
    }
}