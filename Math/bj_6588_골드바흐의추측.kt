/*
📎 https://www.acmicpc.net/problem/6588 - 골드바흐의 추측
📌 에라토스테네스의 체로 소수를 미리 N의 최대값인 1000000까지 다 구해놓고 푸는 문제
📌 입력 N을 받을 때마다 계속 에라토스테네스의 체를 구하면 안됨(시간초과남) 그래서 맨 처음에 1000000까지의 에라토스테네스의 체를 구해놓는 것임
📌 a를 가장 작은 소수로 선정하고 N-a = b 임을 이용해서 N-a의 값이 소수인지 판별하면 된다!
 */

fun main() {
    val primeArr = isPrimeNumber(1000000) // 문제에서 N의 최대가 1000000이라고 했음
    while (true) {
        val N = readLine()!!.toInt()
        if (N == 0) {
            return
        }

        var isOk = false // 골드바흐의 추측 가능한지 여부 체크
        for(i in 2..N) {
            val a = primeArr[i]
            if(a != 0) {
                val b = N - a
                if(primeArr[b] != 0) {
                    println("$N = $a + $b")
                    isOk = true
                    break
                }
            }
        }

        if(isOk == false) {
            println("Goldbach's conjecture is wrong.")
        }
    }
}

// 에라토스테네스의 체 (지움 처리를 0으로 표시함)
fun isPrimeNumber(num: Int): IntArray {
    val primeCheckArr = IntArray(num+1){i -> i}
    primeCheckArr[0] = -1 // index 0은 사용하지 않음 처리
    primeCheckArr[1] = -1 // 1은 소수가 아님 처리
    for(i in 2..num) {
        if(primeCheckArr[i] != 0) {
            for(j in i+i .. num step i) {
                primeCheckArr[j] = 0
            }
        }
    }
    return primeCheckArr
}