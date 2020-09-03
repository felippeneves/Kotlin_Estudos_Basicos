package orientacao_a_objetos.classes

class Quadrado (val area: Float)

//No Kotlin é recomendado que toda classe "Entidade" que transite dados, utilize data class
data class Triangulo (val area: Float)

fun teste(b: Boolean, s: String, i: Int)
{

}

fun main()
{
    val q1 = Quadrado(10F)
    val q2 = Quadrado(10F)

    val t1 = Triangulo(10F)
    val t2 = Triangulo(10F)

    println(q1)
    //Quando a classe do objeto é do tipo data class a maneira na qual é mostrando em um print é diferente de uma class normal, ficando melhor para visualizar
    println(t1)

    //Class normal oque é comparado é o endereço de memória
    println(q1 == q2)
    //Data class é comparado se os atributos são iguais
    println(t1 == t2)

    //Hash gerado para a class através do endereço de memória
    println(q1.hashCode())
    println(q2.hashCode())

    //Hash gerado para a class através dos valores dos paramêtros
    println(t1.hashCode())
    println(t2.hashCode())

    //Método copy é exclusivo da data class
    val t3 = t2.copy()
    println(t3)
}