package conversao_valores

/**

 Double 64
 Float  32
 Long   64
 Int    32
 Short  16
 Byte   8

 */

fun main()
{
    val a: Double = Double.MAX_VALUE
    //Da problema tentar converter um valor tão grande quanto o Double (que ocupa muito mais espaço na memória), pra Byte. Mas o contrário não da problema
    val b: Byte = a.toByte()

    val c: Byte = 127
    val d: Double = c.toDouble()

    println(b)
    println(d)

    //Tentar converter uma string com carctere da ERRO
//    "dsadsa".toInt()
}