/*
📎 https://www.acmicpc.net/problem/1934 - 최소공배수
 */

fun main() {
    val T = readLine()!!.toInt()
    for(i in 0 until T) {
        val inputs = readLine()!!.split(" ").map{ it.toInt() }
        val A = inputs[0]
        val B = inputs[1]

        println((A*B)/GCD(A, B))
    }
}

fun GCD(a: Int, b: Int): Int{
    if(b == 0) {
        return a
    }else{
        return GCD(b, a%b)
    }
}