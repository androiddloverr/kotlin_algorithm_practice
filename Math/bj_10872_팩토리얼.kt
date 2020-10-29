/*
📎 https://www.acmicpc.net/problem/10872 - 팩토리얼
 */

fun main() {
    val N = readLine()!!.toInt()
    var result = 1
    for(i in 1..N) {
        result *= i
    }
    print(result)
}