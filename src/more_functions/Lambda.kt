package more_functions

fun operator2(x: Int, y: Int, op: (Int, Int) -> Int) : Int
{
    return op(x, y)
}

fun main()
{
    val l1 = { x: Int, y: Int -> x + y }
    val l2: (Int, Int) -> Int = { a, b -> a + b }
    operator2(10, 20, l1)
    operator2(10, 20, l2)
}