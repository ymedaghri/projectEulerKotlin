package com.youyou.kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class Problem_3KtTest {

    @Test
    fun shouldListThePrimeFactorsOfANumber() {

        Assertions.assertEquals( 3, 18.largestPrimeFactor())
        Assertions.assertEquals(7, 49.largestPrimeFactor())
        Assertions.assertEquals(59, 59.largestPrimeFactor())
        Assertions.assertEquals(6857, 600851475143.largestPrimeFactor())
    }

    @Test
    fun shouldFindSmallestPrimeOfANumber() {
        Assertions.assertEquals(59, smallestPrime(59))
        Assertions.assertEquals(7, smallestPrime(49))
        Assertions.assertEquals(2, smallestPrime(18))
    }
}




