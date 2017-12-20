package com.youyou.kotlin

fun main(args: Array<String>) {
    println("""If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

Result is ${sumAllMultipleOfThreeOrFiveBelow(1000)}
    """
    )
}

fun findMultipleOfThreeOrFiveBelow(number:Int) = (1 until number).filter { it%3==0 || it%5==0 }

fun sumAllMultipleOfThreeOrFiveBelow(number: Int):Int = findMultipleOfThreeOrFiveBelow(number).sum()
