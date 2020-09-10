package more_functions

//Com a palavra reservada "infix" é possível utilizar a função do modo que está sendo chamado na função main e somente é possível utiliza-la se a função possuir
//apenas um paramêtro
infix fun Int.isHalfOf(value: Int) = value/2 == this

class Person(val name: String)
{
    infix fun isName(value: String) : Boolean
    {
        return value == name
    }
}

fun main()
{
    println(10 isHalfOf 10)
    val p1: Person = Person("Gabriel")
    println(p1 isName "Gabriel")
}