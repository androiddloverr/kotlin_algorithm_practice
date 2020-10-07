/*
📎 https://www.acmicpc.net/problem/11022 - A+B-8
 */

fun main() {
    val T: Int = readLine()!!.toInt()

    for(i in 0 until T) {
        val input = readLine()!!.split(" ").map{ it.toInt() }
        println("Case #${i+1}: ${input[0]} + ${input[1]} = ${input[0] + input[1]} ")
    }
}