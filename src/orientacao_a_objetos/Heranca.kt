package orientacao_a_objetos

//Para a classe poder ser herdada é necessário incluir "open" antes da class
open class Maquina(val marca: String)
{
    //Para o método poder ser sobrescrito é necessário incluir "open" antes da fun
    open fun minhaMarca()
    {
        println("Minha marca é $marca")
    }

    protected fun teste() {}
}

//Computador é uma especialização de Maquina
class Computador(marca: String, val nucleos: Int) : Maquina(marca)
{
    override fun minhaMarca()
    {
        val teste = 20
        super.minhaMarca()
    }

    //Sobrecarga
    fun teste(i: Int) = println("Teste")
    fun teste2(i: Double) = println("Teste")

    //public é default para fun e class
    public fun ligar(){}
    fun processar(){}

    private fun validar() {}
}

fun main()
{
    val c = Computador("xpto", 10)
    with(c)
    {
        ligar()
        processar()
        minhaMarca()
    }
}