package Variaveis

/**

 Type       Bit
 Double     64
 Float      32
 Long       64
 Int        32
 Short      16
 Byte       8
 Boolean    ? (Pode variar de acordo com a JVM)
 String     ? (Pode variar de acordo com a JVM)
 Char       ? (Pode variar de acordo com a JVM)

 */

/** Unidades de medidas

1 Byte = 8 bits
1 Kilobyte (KB) = 1024 bytes
1 Megabyte (MB) = 1024 kilobytes
1 Gigabyte (GB) = 1024 megabytes

 */

fun main()
{
    println("Double: Max: " + Double.MAX_VALUE + " - Min: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Min: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)
}