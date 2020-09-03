package orientacao_a_objetos

class Pessoa
{
    //Para poder inicializar posteriormente é necessário incluir "lateinit"
    lateinit var nome: String

    fun geradorDeNome()
    {
        nome = "fdslkfdsh"
    }
}

fun main()
{
    var p = Pessoa()
    p.geradorDeNome()
}