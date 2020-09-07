package collections

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())
data class Ingredients(val name: String, val quantity: Int)

fun main()
{
    // Cria lista de dados
    val data = listOf(
            Food(
                    "Lasanha", 1200.0,
                    listOf(Ingredients("Farinha", 1),
                            Ingredients("Presunto", 5),
                            Ingredients("Queijo", 10),
                            Ingredients("Molho de tomate", 2),
                            Ingredients("Manjerição", 3)
                    )
            ),
            Food("Panqueca", 500.0),
            Food("Omelete", 200.0),
            Food("Parmegiana", 700.0),
            Food("Sopa de feijão", 300.0),
            Food("Hamburguer", 2000.0,
                    listOf(Ingredients("Pão", 1),
                            Ingredients("Hamburguer", 3),
                            Ingredients("Queijo", 1),
                            Ingredients("Catupiry", 1),
                            Ingredients("Bacon", 3),
                            Ingredients("Alface", 1),
                            Ingredients("Tomate", 1)
                    )
            )
    )

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "Sim" else "Não"}")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().name}.")
    println("A última receita é: ${data.last().name}.")

    //Qual a soma de calorias
    val sumCalories = data.sumByDouble { it.calories }
    println("A soma de calorias é: $sumCalories")

    //Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex())
        println("${x.index} - ${x.value.name}") //Quando é utilizado esse for com o withIndex, esse value é o objeto, portanto fica index/value (atributos)

    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.name.contains("Lasanha") }) "sim" else "não"}.")

    //Sei como fazer panqueca? E Sushi
    val knowPancake = data.filter { it.name.trim() == "Panqueca" }.any() //sempre pra usar um predicado é necessário utilizar a palavra reservada "it"
    println("Sei fazer panqueca? ${if (knowPancake) "Sim" else "Não"}")

    val knowSushi = data.filter { it.name.trim() == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "Sim" else "Não"}")

    //Quais são as comidas com mais de 500 calorias?
    data.filter { it.calories > 500 }.forEach { println(it.name) } //retorna uma lista

    //Par (Chave, valor) de comidas com mais de 500 calorias (name, calories)
    data.filter { it.calories > 500 }.map { Pair(it.name, it.calories) }.forEach { println("${it.first}: ${it.second}") }

    //Quais das receitas possui farinhas como ingrediente?
    data.filter { hasIngredient(it.ingredients, "Farinha") }.forEach { println(it.name) }
}

fun hasIngredient(list: List<Ingredients>, name: String) = list.filter { it.name == name }.any()
