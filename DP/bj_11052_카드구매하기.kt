/*
📎 https://www.acmicpc.net/problem/11052 - 카드구매하기
📌 dp 문제
📌 풀이는 https://choheeis.github.io/newblog//articles/2020-10/DynamicProgramming2 이 포스팅에서 볼 수 있다!
 */

fun main() {
    val T = readLine()!!.toInt()
    val ps = arrayListOf<Int>()
    ps.add(-1) // index 1부터 사용하기 위해 index 0 은 안씀 처리
    ps.addAll(1, readLine()!!.split(" ").map{it.toInt()})
    BJ_11052().solution(ps)
}

class BJ_11052 {
    fun solution(ps: ArrayList<Int>) {
        var d = IntArray(1001){0}
        d[0] = 0
        d[1] = ps[1]

        for(i in 2..ps.size-1) {
            var max = 0
            for(j in 1..i) {
                val tmp = ps[j] + d[i-j]
                if(max < tmp) {
                    max = tmp
                }
            }
            d[i] = max
        }

        print(d[ps.size-1])
    }
}