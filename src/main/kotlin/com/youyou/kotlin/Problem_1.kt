package com.youyou.kotlin

fun main(args: Array<String>) {
    println("""If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

Result is ${findMultipleOfThreeOrFiveBelow(1000)}
    """
    )
}

fun findMultipleOfThreeOrFiveBelow(number:Int) = (0 until number).reduce({ acc:Int, i:Int -> if (i%3==0 || i%5==0) acc+i else acc })
