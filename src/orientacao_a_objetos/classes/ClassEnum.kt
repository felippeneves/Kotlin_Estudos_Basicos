package orientacao_a_objetos.classes

enum class Prioridade
{
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id: Int)
{
    BAIXA(1)
    {
        override fun toString(): String {
            return "TESTE"
        }
    },

    MEDIA(5),
    ALTA(10)
}

class Alarme(var desc: String, p: Prioridade2)

fun main()
{
//    Alarme("Alarme", Prioridade2.ALTA)

    println(Prioridade.ALTA)
    println(Prioridade2.ALTA.id)
    //
    for (p in Prioridade2.values())
    {
        //ordinal = posição em que o enum está
        println("$p - ${p.id} - ${p.ordinal}")
    }
}