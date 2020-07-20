package Variaveis


fun main()
{
    //region Variáveis mutáveis

    var nome = "Felippe Neves"
    nome = "Luiz Felippe Neves Monteiro"

    //endregion

    //region Variáveis mutáveis

    val idade = 10

    //da erro pq o kotlin não sabe oque ela representa (Nesse caso não saberá o tanto de memória para alocar para a variável)
    //val y

    val x: Int
    x = 10
    //Aqui da erro pq como é uma constante, não é possível altera-la mais de uma vez
    //x = 20

    //endregion

    //region Print dos testes

    println(nome)
    println(idade)


    //endregion
}

