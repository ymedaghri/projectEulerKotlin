package com.youyou.kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class Problem_2KtTest {

    @Test
    fun shouldSumAllFibonnaciTermsBelow10() {
        val sum = sumAllFibonnaciTermsBelow(10) { true }
        Assertions.assertEquals(19, sum)
    }

    @Test
    fun shouldSumAllFibonnaciTermsBelow_4_000_000() {
        val sum = sumAllFibonnaciTermsBelow(4_000_000) { true }
        Assertions.assertEquals(9227463, sum)
    }
}