package orientacao_a_objetos

//com o private constructor() ela nunca poderá ser instanciada
class Constants private constructor()
{
    companion object BANCO
    {
        val TABLE = "BANCO"

        fun teste()
        {
            println("TESTE")
        }
    }

    object VENDAS
    {
        val TABLE_NAME = "VENDAS"

        object COLUNAS
        {
            val ID = "ID"
            val TOTAL = "TOTAL"
        }
    }
}

fun main()
{
    Constants.VENDAS.TABLE_NAME
    Constants.teste()
}