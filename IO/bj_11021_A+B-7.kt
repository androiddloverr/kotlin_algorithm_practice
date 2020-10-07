/*
📎 https://www.acmicpc.net/problem/11021 - A+B-7
📌 코틀린에서는 string template를 사용할 수 있음 ${}식으로 사용함
 */

fun main() {
    val T: Int = readLine()!!.toInt()

    for(i in 0 until T) {
        val input = readLine()!!.split(" ").map{ it.toInt() }
        println("Case #${i+1}: ${input[0]+input[1]}")
    }
}