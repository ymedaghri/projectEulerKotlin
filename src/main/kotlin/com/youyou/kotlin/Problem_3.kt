package com.youyou.kotlin

fun main(args: Array<String>) {
    println("""The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
Result is ${600851475143.largestPrimeFactor()}
    """
    )
}

fun smallestPrime(number: Long): Long =
        (2..Math.sqrt(number.toDouble()).toLong()).firstOrNull { number % it == 0L } ?: number

fun Int.largestPrimeFactor():Long = this.toLong().largestPrimeFactor()

fun Long.largestPrimeFactor(): Long {
    var largestPrime: Long
    var mutableNumber = this;
    do {
        largestPrime = smallestPrime(mutableNumber)
        mutableNumber = mutableNumber / largestPrime
    } while (mutableNumber > 1)

    return largestPrime
}


