package more_class

//A palavra reservada "Sealed", somente é possível herdar essa classe apenas nesse arquivo
sealed class Result
{
    class Success(val message: String) : Result()
    class Error(val message: String, val errorCode: Int ) : Result()
}

class Repo
{
    fun execute() : Result
    {
//        return Result.Success("Deu certo!")
        return Result.Error("Deu Erro!", 404)
    }
}

fun main()
{
    val r1 = Repo()
    val result: Result = r1.execute()
    when (result)
    {
        is Result.Success ->
        {
            println("Deu Sucesso")
        }
        is Result.Error ->
        {
            println("Deu Erro")
        }
    }
}