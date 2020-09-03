package orientacao_a_objetos

interface TesteInterface
{
    fun ligar()
    //É possível implementar um método na interface
    fun desligar()
    {
        println("Off")
    }
}

class TesteClass : TesteInterface
{
    override fun ligar()
    {

    }
}

interface Inteface1
{
    fun ola()
    {
        println("interface 1")
    }
}

interface Inteface2
{
    fun ola()
    {
        println("interface 2")
    }
}

class ImplementandoInterface : Inteface1, Inteface2
{
    override fun ola()
    {
        super<Inteface1>.ola()
        super<Inteface2>.ola()
    }

}

fun main()
{

}