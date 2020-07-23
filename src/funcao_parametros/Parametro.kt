package funcao_parametros

fun main()
{
    //chamada do método, especificando o paramêtro e o valor. Vale ressaltar que dessa maneira, não é preciso passar os paramêtreos na ordem em que estão no método que está sendo chamado
    endereco(cidade = "Ribeirão Preto", estado = "SP", cep = "13")
    endereco(cep = "13", cidade = "Ribeirão Preto", estado = "SP")

    //pode passar N valores float como paramêtro nesse método
    calculaMedia(7.4f, 8.5f, 6.5.toFloat())
    calculaMedia(10f, 8f)
    //
    testeGenerics(1, 1.5f, false, "Teste")
}

//Exemplo de paramêtro com valor default
fun endereco(rua: String = "teste", cidade: String, estado: String, cep: String, numero: Int = 10)
{
    println("Rua: $rua, $numero")
    println("Cidade: $cidade, $estado - $cep")
    println()
}

fun calculaMedia(vararg notas: Float)
{
    if(notas.isNotEmpty())
    {
        var soma = 0f
        for(nota in notas)
            soma += nota

        println("A média é: ${soma/notas.size}")
    }
}

//Semelhante ao generics no java
fun <T> testeGenerics(vararg valores: T)
{
    println("\nTeste Generics")
    for(valor in valores)
        print("$valor ")
}