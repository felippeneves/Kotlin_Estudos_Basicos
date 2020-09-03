package orientacao_a_objetos

import funcao.calcula

interface Funcionario
{
    fun calculaBonus()
}

class Gerente : Funcionario
{
    override fun calculaBonus()
    {
        println("Bônus: 500")
    }
}

class Tecnico : Funcionario
{
    override fun calculaBonus()
    {
        println("Bônus: 200")
    }
}

fun main()
{
    val gerente = Gerente()
    val tecnico = Tecnico()

    calculo(gerente)
    calculo(tecnico)
}

fun calculo(funcionario: Funcionario)
{
    funcionario.calculaBonus()
}