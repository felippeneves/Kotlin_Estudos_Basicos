package orientacao_a_objetos.classes

class Person

class Person2(var name: String)

              //Construtor primário
class Person3(var name: String)
{
    var yearBirth: Int? = null

    //Construtor secundario (Sempre deve chamar o primário)
    constructor(name: String, yearBirth : Int) : this(name)
    {
        this.yearBirth = yearBirth
    }

    fun salutation()
    {
        println("Nome: $name | Year of birth: $yearBirth")
    }
}

fun main()
{
    val person = Person3("Felippe", 1998)
    person.salutation()
    //
    val person2 = Person3("Luiz")
    person2.salutation()
}