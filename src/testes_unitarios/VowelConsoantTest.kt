package testes_unitarios

import org.junit.Assert
import org.junit.Test

class VowelConsoantTest
{
    @Test
    fun countVowels()
    {
        Assert.assertEquals(11, countVowels("Quantas vogais tem esta frase"))
    }

    @Test
    fun countConsoants()
    {
        Assert.assertEquals(17, countConsoants("Quantas consoantes tem esta frase?"))
    }
}