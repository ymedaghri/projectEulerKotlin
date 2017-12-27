package com.youyou.kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions
import kotlin.test.assertEquals

internal class Problem_1Test {

    @Test
    fun shouldFindTheSumOfAllMultipleOfThreeOrFiveBelow1000()
    {
        val result = findMultipleOfThreeOrFiveBelow(1000)
        Assertions.assertEquals(233168, result)
    }
}
