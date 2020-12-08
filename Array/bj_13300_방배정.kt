/*
📎 https://www.acmicpc.net/problem/13300 - 방 배정
 */

fun main() {
    BJ_13300().solution()
}

class BJ_13300 {
    fun solution() {
        val input1 = readLine()!!.split(" ").map{ it.toInt() }
        val N = input1[0] // 학생 수
        val K = input1[1] // 한 방의 최대 학생 수

        // Init arrays
        var womanCheckArr = IntArray(7){0}
        var manCheckArr = IntArray(7){0}

        for(i in 0 until N) {
            val input2 = readLine()!!.split(" ").map{ it.toInt() }
            val S = input2[0] // 성별 (0 : 여, 1 : 남)
            val Y = input2[1] // 학년
            if(S == 0) {
                womanCheckArr[Y]++
            }else{
                manCheckArr[Y]++
            }
        }

        var sum = 0
        womanCheckArr.forEach {
            if(it%K != 0) {
                sum += it/K + 1
            }else{
                sum += it/K
            }
        }

        manCheckArr.forEach {
            if(it%K != 0) {
                sum += it/K + 1
            }else{
                sum += it/K
            }
        }
        print(sum)
    }
}