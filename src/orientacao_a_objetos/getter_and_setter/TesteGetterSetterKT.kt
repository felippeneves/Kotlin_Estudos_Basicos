package orientacao_a_objetos.getter_and_setter;

import orientacao_a_objetos.getter_and_setter.TesteGetterSetterJV

class TesteGetterSetterKT (var name: String)
{
    var number: Int = 0
        get()
        {
            println("Get foi chamado")
            //Dessa maneira daria StackOverflow, pois o kotlin interpreta isso como uma função recursiva
//           return number
            return field
        }
        set(value)
        {
            println("Set foi chamado")
            //Dessa maneira daria StackOverflow, pois o kotlin interpreta isso como uma função recursiva
//            this.number = number
            field = value
        }
}

fun main()
{
    var testeJV: TesteGetterSetterJV = TesteGetterSetterJV()
    //Por baixo dos panos está acessando o método getter da classe TesteGetterSetterJV (Em java)
    testeJV.name

    //Por baixo dos panos está acessando o método setter da classe TesteGetterSetterJV (Em java)
    testeJV.name = "Teste"
    //
    //
    var testeKT = TesteGetterSetterKT("XPTO")
    println(testeKT.number)
    testeKT.number = 20
    println(testeKT.number)
}