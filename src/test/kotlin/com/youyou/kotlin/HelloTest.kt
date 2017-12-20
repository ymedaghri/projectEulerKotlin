package com.youyou.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun shouldFindMultipleOfThreeOrFiveBelow10()
    {
        val resultList = findMultipleOfThreeOrFiveBelow(10)
        assertEquals(resultList, listOf(3, 5, 6, 9))
    }

    @Test
    fun shouldFindTheSumOfAllMultipleOfThreeOrFiveBelow1000()
    {
        val result = sumAllMultipleOfThreeOrFiveBelow(1000)
        assertEquals(result, 233168)
    }
}
