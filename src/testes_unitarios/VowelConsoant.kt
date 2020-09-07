package testes_unitarios

fun countVowels(phrase: String) : Int
{
    var totalVowels = 0

    for(letter in phrase)
    {
        if(isVowels(letter))
            totalVowels++
    }

    return totalVowels
}

fun countConsoants(phrase: String) : Int
{
    var totalConsoants = 0

    for(letter in phrase)
    {
        if(isConsoant(letter))
            totalConsoants++
    }

    return totalConsoants
}

fun isVowels(letter: Char) : Boolean
{
    val VOWELS = "aeiou"
    return letter.toLowerCase() in VOWELS
}

fun isConsoant(letter: Char) : Boolean
{
    val CONSOANTS = "bcdfghjklmnpqrstvwxyz"
    return letter.toLowerCase() in CONSOANTS
}

fun countVowelsFilter(str: String) : Int
{
    return str.filter { isVowels(it) }.count()
}