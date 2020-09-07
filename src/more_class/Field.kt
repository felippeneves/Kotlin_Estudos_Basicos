package more_class

import java.lang.Exception

class Car(val model: String, val maxSpeed: Int)
{
    var currentSpeed: Int = 0
        set(value)
        {
            if(value > maxSpeed)
                throw Exception("Velciodade maior do que a permitida!")
            else
                field = value
        }
        get()
        {
            //regras de negócio
            return field
        }
}

fun main()
{
    val c1 = Car("Ferrari", 220)
    c1.currentSpeed = 150

    println(c1.currentSpeed)
}