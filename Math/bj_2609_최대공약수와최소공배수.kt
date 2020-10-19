/*
📎 https://www.acmicpc.net/problem/2609 - 최대공약수와 최소공배수
📌 유클리드 호제법 --> https://choheeis.github.io/newblog//articles/2019-05/%EC%B5%9C%EB%8C%80%EA%B3%B5%EC%95%BD%EC%88%98-%EC%B5%9C%EC%86%8C%EA%B3%B5%EB%B0%B0%EC%88%98
 */

fun main() {
    // input
    val inputs = readLine()!!.split(" ").map{ it.toInt() }
    val A = inputs[0]
    val B = inputs[1]

    // action
    val gcd = GCD(A, B)
    val lcm = (A*B)/gcd
    println(gcd)
    println(lcm)
}

fun GCD(a: Int, b: Int): Int{
    if(b == 0) {
        return a
    }else{
        return GCD(b, a%b)
    }
}