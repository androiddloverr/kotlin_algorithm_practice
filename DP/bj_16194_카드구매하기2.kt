/*
📎 https://www.acmicpc.net/problem/16194 - 카드구매하기2
📌 dp 문제
📌 https://www.acmicpc.net/problem/11052 - 카드구매하기 의 최솟값 버전 문제
 */

fun main() {
    val T = readLine()!!.toInt()
    val ps = arrayListOf<Int>()
    ps.add(-1) // index 1부터 사용하기 위해 index 0 은 안씀 처리
    ps.addAll(1, readLine()!!.split(" ").map{it.toInt()})
    BJ_16194().solution(ps)
}

class BJ_16194 {
    fun solution(ps: ArrayList<Int>) {
        var d = IntArray(1001){0}
        d[0] = 0
        d[1] = ps[1]

        for(i in 2..ps.size-1) {
            var min = 10000001
            for(j in 1..i) {
                val tmp = ps[j] + d[i-j]
                if(min > tmp) {
                    min = tmp
                }
            }
            d[i] = min
        }

        print(d[ps.size-1])
    }
}