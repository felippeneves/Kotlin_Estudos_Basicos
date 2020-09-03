package orientacao_a_objetos

abstract class Mammal(var name: String)
{
    var peso: Float = 0F

    abstract fun walk()

    fun dormir()
    {
        println("I'm sleeping")
    }
}

class Dog(name: String, peso: Float) : Mammal(name)
{
    //Método é executado quando uma classe é instanciada, a diferença com o construtor, é que ele é executado independente de quantos construtores existem
    init
    {
        this.peso = peso
    }

    override fun walk()
    {
        println("Walking like a dog")
    }
}

class Cat(name: String) : Mammal(name)
{
    override fun walk()
    {
        println("Walking like a cat")
    }
}

fun main()
{

}