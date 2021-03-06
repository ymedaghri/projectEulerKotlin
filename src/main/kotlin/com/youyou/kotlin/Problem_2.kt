package com.youyou.kotlin

fun main(args: Array<String>) {
    println("""Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

Result is ${sumAllEvenFibonnaciTermsBelow(4000000) }
    """
    )
}



fun sumAllFibonnaciTermsBelow(number: Int, filter: (Int) -> Boolean):Int {

    var condition = true
    var previousElement = 1
    var fibonacciElement = 2
    var sum = fibonacciElement + previousElement

    while (condition) {

        val tmp=fibonacciElement
        fibonacciElement=fibonacciElement + previousElement
        previousElement=tmp

        when {
            fibonacciElement >= number -> condition = false
            filter(fibonacciElement)==true -> sum += fibonacciElement
        }
    }
    return sum
}

fun sumAllEvenFibonnaciTermsBelow(number: Int):Int {
    val isEvenFilter: (Int) -> Boolean = { element -> element % 2 == 0 }
    return sumAllFibonnaciTermsBelow(number, isEvenFilter)
}
