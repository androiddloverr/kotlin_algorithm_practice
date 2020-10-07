/*
📎 https://www.acmicpc.net/problem/1000 - A+B
📌 1. 코틀린 입력 중 공백을 기준으로 입력받는 방법 : 전체를 한 문자열로 받은 후, 공백을 기준으로 split하여 배열에 저장
 */

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    for(i in (0 until input.size)) {
        sum += input[i]
    }

    println(sum)
}