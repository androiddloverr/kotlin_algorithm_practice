/*
📎 https://www.acmicpc.net/problem/9095 - 1,2,3 더하기
📌 문제 풀이 --> https://choheeis.github.io/newblog//articles/2020-10/DynamicProgramming2 에서 알 수 있다.
 */

fun main() {
    val T = readLine()!!.toInt()
    BJ_9095().solution(T)
}

class BJ_9095 {
    fun solution(T: Int) {
        val memo = IntArray(11){0}
        memo[0] = -1 // index 0은 안씀 처리
        memo[1] = 1
        memo[2] = 2
        memo[3] = 4

        // 문제에서 n은 1 ~ 10까지라고 했으므로 10까지 memo값을 다 구해놓고, 테스트 케이스를 돌려야 시간 효율성 높아짐
        for(i in 4..10) {
            for(j in i-1 downTo i-3) {
                memo[i] += memo[j]
            }
        }

        // input
        for(i in 0 until T) {
            val n = readLine()!!.toInt()
            println(memo[n])
        }
    }
}
