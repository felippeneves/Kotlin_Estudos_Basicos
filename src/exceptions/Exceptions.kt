package exceptions

import java.lang.NumberFormatException

fun main()
{
    try
    {
        "fdkslfjds".toInt()
    }
    catch (e: NumberFormatException)
    {
        println(e.toString())
    }
    finally
    {
        println("Terminou")
    }
}