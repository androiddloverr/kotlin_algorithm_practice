/*
📎 https://www.acmicpc.net/problem/10430 - 나머지 연산
📌 나머지 연산(모듈러 연산)의 특징 --> https://choheeis.github.io/newblog//articles/2020-10/%EB%82%98%EB%A8%B8%EC%A7%80%EC%97%B0%EC%82%B0
 */

fun main() {
    val inputs = readLine()!!.split(" ").map{ it.toInt() }
    val A = inputs[0]
    val B = inputs[1]
    val C = inputs[2]
    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C) * (B%C))%C)
}